package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.function.BiConsumer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ReadOnlyClassToSerializerMap {
    private final Bucket[] _buckets;
    private final int _mask;
    private final int _size;

    public static final class Bucket {
        protected final Class<?> _class;
        protected final boolean _isTyped;
        protected final JavaType _type;
        public final Bucket next;
        public final JsonSerializer<Object> value;

        public Bucket(Bucket bucket, TypeKey typeKey, JsonSerializer<Object> jsonSerializer) {
            this.next = bucket;
            this.value = jsonSerializer;
            this._isTyped = typeKey.isTyped();
            this._class = typeKey.getRawType();
            this._type = typeKey.getType();
        }

        public boolean matchesTyped(Class<?> cls) {
            return this._class == cls && this._isTyped;
        }

        public boolean matchesUntyped(Class<?> cls) {
            return this._class == cls && !this._isTyped;
        }

        public boolean matchesTyped(JavaType javaType) {
            return this._isTyped && javaType.equals(this._type);
        }

        public boolean matchesUntyped(JavaType javaType) {
            return !this._isTyped && javaType.equals(this._type);
        }
    }

    public ReadOnlyClassToSerializerMap(LRUMap<TypeKey, JsonSerializer<Object>> lRUMap) {
        int findSize = findSize(lRUMap.size());
        this._size = findSize;
        this._mask = findSize - 1;
        final Bucket[] bucketArr = new Bucket[findSize];
        lRUMap.contents(new BiConsumer() { // from class: com.fasterxml.jackson.databind.ser.impl.a
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ReadOnlyClassToSerializerMap.this.lambda$new$0(bucketArr, (TypeKey) obj, (JsonSerializer) obj2);
            }
        });
        this._buckets = bucketArr;
    }

    private static final int findSize(int i3) {
        int i10 = 8;
        while (i10 < (i3 <= 64 ? i3 + i3 : i3 + (i3 >> 2))) {
            i10 += i10;
        }
        return i10;
    }

    public static ReadOnlyClassToSerializerMap from(LRUMap<TypeKey, JsonSerializer<Object>> lRUMap) {
        return new ReadOnlyClassToSerializerMap(lRUMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Bucket[] bucketArr, TypeKey typeKey, JsonSerializer jsonSerializer) {
        int hashCode = typeKey.hashCode() & this._mask;
        bucketArr[hashCode] = new Bucket(bucketArr[hashCode], typeKey, jsonSerializer);
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        Bucket bucket = this._buckets[TypeKey.typedHash(javaType) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesTyped(javaType)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesTyped(javaType));
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        Bucket bucket = this._buckets[TypeKey.untypedHash(javaType) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesUntyped(javaType)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesUntyped(javaType));
        return bucket.value;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        Bucket bucket = this._buckets[TypeKey.typedHash(cls) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesTyped(cls)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesTyped(cls));
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        Bucket bucket = this._buckets[TypeKey.untypedHash(cls) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesUntyped(cls)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesUntyped(cls));
        return bucket.value;
    }
}
