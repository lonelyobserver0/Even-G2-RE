package com.mapbox.bindgen;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class JniGlobalRegistry {
    private static final int SHARD_BITS = 8;
    private static final int SHARD_COUNT = 256;
    private static final long SHARD_MASK = 255;
    private static final HashMap<Long, ObjectReferences>[] storageShards;

    static {
        HashMap<Long, ObjectReferences>[] hashMapArr = new HashMap[256];
        for (int i3 = 0; i3 < 256; i3++) {
            hashMapArr[i3] = new HashMap<>();
        }
        storageShards = hashMapArr;
    }

    public static native void activate();

    public static native void deactivate();

    public static void delete(long j, int i3) {
        HashMap<Long, ObjectReferences> storageShardFor = storageShardFor(j);
        synchronized (storageShardFor) {
            try {
                ObjectReferences objectReferences = storageShardFor.get(Long.valueOf(j));
                if (objectReferences == null) {
                    return;
                }
                objectReferences.delete(i3);
                if (objectReferences.getReferenceCount() == 0) {
                    storageShardFor.remove(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Object get(long j, int i3) {
        HashMap<Long, ObjectReferences> storageShardFor = storageShardFor(j);
        synchronized (storageShardFor) {
            try {
                ObjectReferences objectReferences = storageShardFor.get(Long.valueOf(j));
                if (objectReferences == null) {
                    return null;
                }
                Object obj = objectReferences.get(i3);
                if (!(obj instanceof WeakReference)) {
                    return obj;
                }
                return ((WeakReference) obj).get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int[] getShardUtilization() {
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr[i3] = storageShards[i3].size();
        }
        return iArr;
    }

    private static int newReference(long j, Object obj) {
        HashMap<Long, ObjectReferences> storageShardFor = storageShardFor(j);
        synchronized (storageShardFor) {
            try {
                ObjectReferences objectReferences = storageShardFor.get(Long.valueOf(j));
                if (objectReferences != null) {
                    return objectReferences.addAdditional(obj);
                }
                storageShardFor.put(Long.valueOf(j), new ObjectReferences(obj));
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int newStrongReference(long j, Object obj) {
        if (obj != null) {
            return newReference(j, obj);
        }
        return -1;
    }

    public static int newWeakReference(long j, Object obj) {
        if (obj != null) {
            return newReference(j, new WeakReference(obj));
        }
        return -1;
    }

    private static HashMap<Long, ObjectReferences> storageShardFor(long j) {
        return storageShards[(int) ((j >> 8) & SHARD_MASK)];
    }
}
