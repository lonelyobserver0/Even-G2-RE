package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B>\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010 J\u001f\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010-J\u0017\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001e\u0010/\u001a\u0002002\u0014\u00101\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000102H\u0016J\b\u00103\u001a\u000200H\u0016J\u0015\u00104\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010$¨\u00065"}, d2 = {"Lkotlin/collections/MutableMapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MutableMapWithDefault;", "map", "", "default", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "getMap", "()Ljava/util/Map;", "equals", "", "other", "", "hashCode", "", "toString", "", "size", "getSize", "()I", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "keys", "", "getKeys", "()Ljava/util/Set;", "values", "", "getValues", "()Ljava/util/Collection;", "entries", "", "getEntries", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "putAll", "", "from", "", "clear", "getOrImplicitDefault", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n348#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n108#1:112,6\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class MutableMapWithDefaultImpl<K, V> implements MutableMapWithDefault<K, V> {
    private final Function1<K, V> default;
    private final Map<K, V> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableMapWithDefaultImpl(Map<K, V> map, Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.map = map;
        this.default = function1;
    }

    @Override // java.util.Map
    public void clear() {
        getMap().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getMap().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getMap().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return getMap().equals(other);
    }

    @Override // java.util.Map
    public V get(Object key) {
        return getMap().get(key);
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return getMap().entrySet();
    }

    public Set<K> getKeys() {
        return getMap().keySet();
    }

    @Override // kotlin.collections.MutableMapWithDefault, kotlin.collections.MapWithDefault
    public Map<K, V> getMap() {
        return this.map;
    }

    @Override // kotlin.collections.MapWithDefault
    public V getOrImplicitDefault(K key) {
        Map<K, V> map = getMap();
        V v2 = map.get(key);
        return (v2 != null || map.containsKey(key)) ? v2 : this.default.invoke(key);
    }

    public int getSize() {
        return getMap().size();
    }

    public Collection<V> getValues() {
        return getMap().values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        return getMap().put(key, value);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        getMap().putAll(from);
    }

    @Override // java.util.Map
    public V remove(Object key) {
        return getMap().remove(key);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
