package com.fasterxml.jackson.databind.util.internal;

import com.stub.StubApp;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PrivateMaxEntriesMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final int NCPU;
    static final int NUMBER_OF_READ_BUFFERS;
    static final int READ_BUFFERS_MASK;
    final AtomicLong capacity;
    final int concurrencyLevel;
    final ConcurrentMap<K, Node<K, V>> data;
    final AtomicReference<DrainStatus> drainStatus;
    transient Set<Map.Entry<K, V>> entrySet;
    final LinkedDeque<Node<K, V>> evictionDeque;
    final Lock evictionLock;
    transient Set<K> keySet;
    final AtomicLongArray readBufferDrainAtWriteCount;
    final long[] readBufferReadCount;
    final AtomicLongArray readBufferWriteCount;
    final AtomicReferenceArray<Node<K, V>> readBuffers;
    transient Collection<V> values;
    final AtomicLong weightedSize;
    final Queue<Runnable> writeBuffer;

    /* renamed from: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class AddTask implements Runnable {
        final Node<K, V> node;
        final int weight;

        public AddTask(Node<K, V> node, int i3) {
            this.weight = i3;
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = PrivateMaxEntriesMap.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.weight);
            if (((WeightedValue) this.node.get()).isAlive()) {
                PrivateMaxEntriesMap.this.evictionDeque.add((LinkedDeque<Node<K, V>>) this.node);
                PrivateMaxEntriesMap.this.evict();
            }
        }
    }

    public static final class Builder<K, V> {
        long capacity = -1;
        int initialCapacity = 16;
        int concurrencyLevel = 16;

        public PrivateMaxEntriesMap<K, V> build() {
            PrivateMaxEntriesMap.checkState(this.capacity >= 0);
            return new PrivateMaxEntriesMap<>(this, null);
        }

        public Builder<K, V> concurrencyLevel(int i3) {
            PrivateMaxEntriesMap.checkArgument(i3 > 0);
            this.concurrencyLevel = i3;
            return this;
        }

        public Builder<K, V> initialCapacity(int i3) {
            PrivateMaxEntriesMap.checkArgument(i3 >= 0);
            this.initialCapacity = i3;
            return this;
        }

        public Builder<K, V> maximumCapacity(long j) {
            PrivateMaxEntriesMap.checkArgument(j >= 0);
            this.capacity = j;
            return this;
        }
    }

    public enum DrainStatus {
        IDLE { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.1
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z2) {
                return !z2;
            }
        },
        REQUIRED { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.2
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z2) {
                return true;
            }
        },
        PROCESSING { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.3
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z2) {
                return false;
            }
        };

        public abstract boolean shouldDrainBuffers(boolean z2);

        /* synthetic */ DrainStatus(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public final class EntryIterator implements Iterator<Map.Entry<K, V>> {
        Node<K, V> current;
        final Iterator<Node<K, V>> iterator;

        public EntryIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current.key);
            this.current = null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.current = this.iterator.next();
            return new WriteThroughEntry(this.current);
        }
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        final PrivateMaxEntriesMap<K, V> map;

        public EntrySet() {
            this.map = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Node<K, V> node = this.map.data.get(entry.getKey());
            return node != null && node.getValue().equals(entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.map.remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException(StubApp.getString2(11152));
        }
    }

    public final class KeyIterator implements Iterator<K> {
        K current;
        final Iterator<K> iterator;

        public KeyIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.keySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            K next = this.iterator.next();
            this.current = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current);
            this.current = null;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        final PrivateMaxEntriesMap<K, V> map;

        public KeySet() {
            this.map = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return this.map.data.keySet().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.map.data.keySet().toArray(tArr);
        }
    }

    public static final class Node<K, V> extends AtomicReference<WeightedValue<V>> implements Linked<Node<K, V>> {
        final K key;
        Node<K, V> next;
        Node<K, V> prev;

        public Node(K k3, WeightedValue<V> weightedValue) {
            super(weightedValue);
            this.key = k3;
        }

        public V getValue() {
            return ((WeightedValue) get()).value;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public Node<K, V> getNext() {
            return this.next;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public Node<K, V> getPrevious() {
            return this.prev;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public void setNext(Node<K, V> node) {
            this.next = node;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public void setPrevious(Node<K, V> node) {
            this.prev = node;
        }
    }

    public final class RemovalTask implements Runnable {
        final Node<K, V> node;

        public RemovalTask(Node<K, V> node) {
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            PrivateMaxEntriesMap.this.evictionDeque.remove((LinkedDeque<Node<K, V>>) this.node);
            PrivateMaxEntriesMap.this.makeDead(this.node);
        }
    }

    public final class UpdateTask implements Runnable {
        final Node<K, V> node;
        final int weightDifference;

        public UpdateTask(Node<K, V> node, int i3) {
            this.weightDifference = i3;
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = PrivateMaxEntriesMap.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.weightDifference);
            PrivateMaxEntriesMap.this.applyRead(this.node);
            PrivateMaxEntriesMap.this.evict();
        }
    }

    public final class ValueIterator implements Iterator<V> {
        Node<K, V> current;
        final Iterator<Node<K, V>> iterator;

        public ValueIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            Node<K, V> next = this.iterator.next();
            this.current = next;
            return next.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current.key);
            this.current = null;
        }
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            PrivateMaxEntriesMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return PrivateMaxEntriesMap.this.size();
        }
    }

    public static final class WeightedValue<V> {
        final V value;
        final int weight;

        public WeightedValue(V v2, int i3) {
            this.weight = i3;
            this.value = v2;
        }

        public boolean contains(Object obj) {
            V v2 = this.value;
            return obj == v2 || v2.equals(obj);
        }

        public boolean isAlive() {
            return this.weight > 0;
        }
    }

    public final class WriteThroughEntry extends AbstractMap.SimpleEntry<K, V> {
        public WriteThroughEntry(Node<K, V> node) {
            super(node.key, node.getValue());
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public V setValue(V v2) {
            PrivateMaxEntriesMap.this.put(getKey(), v2);
            return (V) super.setValue(v2);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        NCPU = availableProcessors;
        int min = Math.min(4, ceilingNextPowerOfTwo(availableProcessors));
        NUMBER_OF_READ_BUFFERS = min;
        READ_BUFFERS_MASK = min - 1;
    }

    public /* synthetic */ PrivateMaxEntriesMap(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public static int ceilingNextPowerOfTwo(int i3) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i3 - 1));
    }

    public static void checkArgument(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkNotNull(Object obj) {
        obj.getClass();
    }

    public static void checkState(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    private static int readBufferIndex(int i3, int i10) {
        return (i3 * 16) + i10;
    }

    public void afterRead(Node<K, V> node) {
        int readBufferIndex = readBufferIndex();
        drainOnReadIfNeeded(readBufferIndex, recordRead(readBufferIndex, node));
    }

    public void afterWrite(Runnable runnable) {
        this.writeBuffer.add(runnable);
        this.drainStatus.lazySet(DrainStatus.REQUIRED);
        tryToDrainBuffers();
    }

    public void applyRead(Node<K, V> node) {
        if (this.evictionDeque.contains((Linked<?>) node)) {
            this.evictionDeque.moveToBack(node);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.evictionLock.lock();
        while (true) {
            try {
                Node<K, V> poll = this.evictionDeque.poll();
                if (poll == null) {
                    break;
                }
                this.data.remove(poll.key, poll);
                makeDead(poll);
            } catch (Throwable th) {
                this.evictionLock.unlock();
                throw th;
            }
        }
        for (int i3 = 0; i3 < this.readBuffers.length(); i3++) {
            this.readBuffers.lazySet(i3, null);
        }
        while (true) {
            Runnable poll2 = this.writeBuffer.poll();
            if (poll2 == null) {
                this.evictionLock.unlock();
                return;
            }
            poll2.run();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.data.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        checkNotNull(obj);
        Iterator<Node<K, V>> it = this.data.values().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void drainBuffers() {
        drainReadBuffers();
        drainWriteBuffer();
    }

    public void drainOnReadIfNeeded(int i3, long j) {
        if (this.drainStatus.get().shouldDrainBuffers(j - this.readBufferDrainAtWriteCount.get(i3) < 4)) {
            tryToDrainBuffers();
        }
    }

    public void drainReadBuffer(int i3) {
        int readBufferIndex;
        Node<K, V> node;
        long j = this.readBufferWriteCount.get(i3);
        for (int i10 = 0; i10 < 8 && (node = this.readBuffers.get((readBufferIndex = readBufferIndex(i3, (int) (this.readBufferReadCount[i3] & 15))))) != null; i10++) {
            this.readBuffers.lazySet(readBufferIndex, null);
            applyRead(node);
            long[] jArr = this.readBufferReadCount;
            jArr[i3] = jArr[i3] + 1;
        }
        this.readBufferDrainAtWriteCount.lazySet(i3, j);
    }

    public void drainReadBuffers() {
        int id = (int) Thread.currentThread().getId();
        int i3 = NUMBER_OF_READ_BUFFERS + id;
        while (id < i3) {
            drainReadBuffer(READ_BUFFERS_MASK & id);
            id++;
        }
    }

    public void drainWriteBuffer() {
        Runnable poll;
        for (int i3 = 0; i3 < 16 && (poll = this.writeBuffer.poll()) != null; i3++) {
            poll.run();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public void evict() {
        Node<K, V> poll;
        while (hasOverflowed() && (poll = this.evictionDeque.poll()) != null) {
            this.data.remove(poll.key, poll);
            makeDead(poll);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> node = this.data.get(obj);
        if (node == null) {
            return null;
        }
        afterRead(node);
        return node.getValue();
    }

    public boolean hasOverflowed() {
        return this.weightedSize.get() > this.capacity.get();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public void makeDead(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, 0)));
        AtomicLong atomicLong = this.weightedSize;
        atomicLong.lazySet(atomicLong.get() - Math.abs(weightedValue.weight));
    }

    public void makeRetired(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return;
            }
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k3, V v2) {
        return put(k3, v2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k3, V v2) {
        return put(k3, v2, true);
    }

    public long recordRead(int i3, Node<K, V> node) {
        long j = this.readBufferWriteCount.get(i3);
        this.readBufferWriteCount.lazySet(i3, 1 + j);
        this.readBuffers.lazySet(readBufferIndex(i3, (int) (15 & j)), node);
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> remove = this.data.remove(obj);
        if (remove == null) {
            return null;
        }
        makeRetired(remove);
        afterWrite(new RemovalTask(remove));
        return remove.getValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k3, V v2) {
        WeightedValue weightedValue;
        checkNotNull(k3);
        checkNotNull(v2);
        WeightedValue weightedValue2 = new WeightedValue(v2, 1);
        Node<K, V> node = this.data.get(k3);
        if (node == null) {
            return null;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return null;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i3 = 1 - weightedValue.weight;
        if (i3 == 0) {
            afterRead(node);
        } else {
            afterWrite(new UpdateTask(node, i3));
        }
        return weightedValue.value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.data.size();
    }

    public void tryToDrainBuffers() {
        if (this.evictionLock.tryLock()) {
            try {
                AtomicReference<DrainStatus> atomicReference = this.drainStatus;
                DrainStatus drainStatus = DrainStatus.PROCESSING;
                atomicReference.lazySet(drainStatus);
                drainBuffers();
                AtomicReference<DrainStatus> atomicReference2 = this.drainStatus;
                DrainStatus drainStatus2 = DrainStatus.IDLE;
                while (!atomicReference2.compareAndSet(drainStatus, drainStatus2) && atomicReference2.get() == drainStatus) {
                }
                this.evictionLock.unlock();
            } catch (Throwable th) {
                AtomicReference<DrainStatus> atomicReference3 = this.drainStatus;
                DrainStatus drainStatus3 = DrainStatus.PROCESSING;
                DrainStatus drainStatus4 = DrainStatus.IDLE;
                while (!atomicReference3.compareAndSet(drainStatus3, drainStatus4) && atomicReference3.get() == drainStatus3) {
                }
                this.evictionLock.unlock();
                throw th;
            }
        }
    }

    public boolean tryToRetire(Node<K, V> node, WeightedValue<V> weightedValue) {
        if (weightedValue.isAlive()) {
            return node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight));
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.values = values;
        return values;
    }

    private PrivateMaxEntriesMap(Builder<K, V> builder) {
        int i3 = builder.concurrencyLevel;
        this.concurrencyLevel = i3;
        this.capacity = new AtomicLong(Math.min(builder.capacity, 9223372034707292160L));
        this.data = new ConcurrentHashMap(builder.initialCapacity, 0.75f, i3);
        this.evictionLock = new ReentrantLock();
        this.weightedSize = new AtomicLong();
        this.evictionDeque = new LinkedDeque<>();
        this.writeBuffer = new ConcurrentLinkedQueue();
        this.drainStatus = new AtomicReference<>(DrainStatus.IDLE);
        int i10 = NUMBER_OF_READ_BUFFERS;
        this.readBufferReadCount = new long[i10];
        this.readBufferWriteCount = new AtomicLongArray(i10);
        this.readBufferDrainAtWriteCount = new AtomicLongArray(i10);
        this.readBuffers = new AtomicReferenceArray<>(i10 * 16);
    }

    public static int readBufferIndex() {
        return ((int) Thread.currentThread().getId()) & READ_BUFFERS_MASK;
    }

    public V put(K k3, V v2, boolean z2) {
        WeightedValue weightedValue;
        checkNotNull(k3);
        checkNotNull(v2);
        WeightedValue weightedValue2 = new WeightedValue(v2, 1);
        Node<K, V> node = new Node<>(k3, weightedValue2);
        while (true) {
            Node<K, V> putIfAbsent = this.data.putIfAbsent(node.key, node);
            if (putIfAbsent == null) {
                afterWrite(new AddTask(node, 1));
                return null;
            }
            if (z2) {
                afterRead(putIfAbsent);
                return putIfAbsent.getValue();
            }
            do {
                weightedValue = (WeightedValue) putIfAbsent.get();
                if (!weightedValue.isAlive()) {
                    break;
                }
            } while (!putIfAbsent.compareAndSet(weightedValue, weightedValue2));
            int i3 = 1 - weightedValue.weight;
            if (i3 == 0) {
                afterRead(putIfAbsent);
            } else {
                afterWrite(new UpdateTask(putIfAbsent, i3));
            }
            return weightedValue.value;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        Node<K, V> node = this.data.get(obj);
        if (node != null && obj2 != null) {
            WeightedValue<V> weightedValue = (WeightedValue) node.get();
            while (true) {
                if (!weightedValue.contains(obj2)) {
                    break;
                }
                if (tryToRetire(node, weightedValue)) {
                    if (this.data.remove(obj, node)) {
                        afterWrite(new RemovalTask(node));
                        return true;
                    }
                } else {
                    weightedValue = (WeightedValue) node.get();
                    if (!weightedValue.isAlive()) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k3, V v2, V v8) {
        WeightedValue weightedValue;
        checkNotNull(k3);
        checkNotNull(v2);
        checkNotNull(v8);
        WeightedValue weightedValue2 = new WeightedValue(v8, 1);
        Node<K, V> node = this.data.get(k3);
        if (node == null) {
            return false;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive() || !weightedValue.contains(v2)) {
                return false;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i3 = 1 - weightedValue.weight;
        if (i3 == 0) {
            afterRead(node);
        } else {
            afterWrite(new UpdateTask(node, i3));
        }
        return true;
    }
}
