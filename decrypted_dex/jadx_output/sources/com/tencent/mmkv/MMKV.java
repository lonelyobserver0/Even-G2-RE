package com.tencent.mmkv;

import H9.b;
import W9.a;
import W9.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.Log;
import com.stub.StubApp;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumMap f12766a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumMap f12767b;

    /* renamed from: c, reason: collision with root package name */
    public static final a[] f12768c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f12769d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f12770e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f12771f;
    private final long nativeHandle;

    static {
        EnumMap enumMap = new EnumMap(c.class);
        f12766a = enumMap;
        enumMap.put((EnumMap) c.f8206a, (c) 0);
        enumMap.put((EnumMap) c.f8207b, (c) 1);
        EnumMap enumMap2 = new EnumMap(a.class);
        f12767b = enumMap2;
        a aVar = a.f8197a;
        enumMap2.put((EnumMap) aVar, (a) 0);
        a aVar2 = a.f8198b;
        enumMap2.put((EnumMap) aVar2, (a) 1);
        a aVar3 = a.f8199c;
        enumMap2.put((EnumMap) aVar3, (a) 2);
        a aVar4 = a.f8200d;
        enumMap2.put((EnumMap) aVar4, (a) 3);
        a aVar5 = a.f8201e;
        enumMap2.put((EnumMap) aVar5, (a) 4);
        f12768c = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        f12769d = new HashSet();
        f12770e = false;
        new HashMap();
        f12771f = false;
    }

    public static void a(Context context, String str, a aVar) {
        int i3;
        if (!Process.is64Bit()) {
            throw new b(StubApp.getString2(16172));
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        boolean z2 = f12771f;
        if (!f12770e) {
            System.loadLibrary(StubApp.getString2(6936));
            f12770e = true;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            i3 = 0;
        } else if (ordinal != 2) {
            int i10 = 3;
            if (ordinal != 3) {
                i10 = 4;
                if (ordinal != 4) {
                    i3 = 1;
                }
            }
            i3 = i10;
        } else {
            i3 = 2;
        }
        jniInitialize(str, absolutePath, i3, z2, false, 0L);
        if ((context.getApplicationInfo().flags & 2) == 0) {
            synchronized (f12769d) {
            }
            enableDisableProcessMode(false);
            Log.i(StubApp.getString2(16169), StubApp.getString2(16170));
            return;
        }
        synchronized (f12769d) {
        }
        enableDisableProcessMode(true);
        Log.i(StubApp.getString2(16169), StubApp.getString2(16171));
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z2);

    public static void b(String str) {
        a aVar = a.f8198b;
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r1.length - 1];
        Integer num = (Integer) f12767b.get(aVar);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    public static native boolean checkExist(String str, String str2);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z2);

    private static native long createNB(int i3);

    private native boolean decodeBool(long j, String str, boolean z2);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d8);

    private native float decodeFloat(long j, String str, float f10);

    private native int decodeInt(long j, String str, int i3);

    private native long decodeLong(long j, String str, long j3);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i3);

    private native void doCheckReSetCryptKey(String str, boolean z2);

    private native boolean doReKey(String str, boolean z2);

    private static native void enableDisableProcessMode(boolean z2);

    private native boolean encodeBool(long j, String str, boolean z2);

    private native boolean encodeBool_2(long j, String str, boolean z2, int i3);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, byte[] bArr, int i3);

    private native boolean encodeDouble(long j, String str, double d8);

    private native boolean encodeDouble_2(long j, String str, double d8, int i3);

    private native boolean encodeFloat(long j, String str, float f10);

    private native boolean encodeFloat_2(long j, String str, float f10, int i3);

    private native boolean encodeInt(long j, String str, int i3);

    private native boolean encodeInt_2(long j, String str, int i3, int i10);

    private native boolean encodeLong(long j, String str, long j3);

    private native boolean encodeLong_2(long j, String str, long j3, int i3);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeSet_2(long j, String str, String[] strArr, int i3);

    private native boolean encodeString(long j, String str, String str2);

    private native boolean encodeString_2(long j, String str, String str2, int i3);

    private static native long getDefaultMMKV(int i3, String str, boolean z2);

    private static native long getMMKVWithAshmemFD(String str, int i3, int i10, String str2, boolean z2);

    public static native long getMMKVWithID(String str, int i3, String str2, String str3, long j, boolean z2);

    private static native long getMMKVWithIDAndSize(String str, int i3, int i10, String str2, boolean z2);

    private static native boolean getNameSpace(String str);

    private native long importFrom(long j, long j3);

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i3, boolean z2, boolean z10, long j);

    private static void mmkvLogImp(int i3, String str, int i10, String str2, String str3) {
        int ordinal = f12768c[i3].ordinal();
        String string2 = StubApp.getString2(16169);
        if (ordinal == 0) {
            Log.d(string2, str3);
            return;
        }
        if (ordinal == 1) {
            Log.i(string2, str3);
        } else if (ordinal == 2) {
            Log.w(string2, str3);
        } else {
            if (ordinal != 3) {
                return;
            }
            Log.e(string2, str3);
        }
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        c cVar = c.f8206a;
        b(StubApp.getString2(16173) + str + StubApp.getString2(11256) + cVar);
        Integer num = (Integer) f12766a.get(cVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        c cVar = c.f8206a;
        b(StubApp.getString2(16173) + str + StubApp.getString2(11256) + cVar);
        Integer num = (Integer) f12766a.get(cVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z2, boolean z10, long j);

    private static native void setLogLevel(int i3);

    private static native void setWantsContentChangeNotify(boolean z2);

    private native void sync(boolean z2);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z2);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j3, int i3);

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public native void checkContentChangedByOuterProcess();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i3);

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException(StubApp.getString2(16174));
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z2) {
        return decodeBool(this.nativeHandle, str, z2);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return decodeFloat(this.nativeHandle, str, f10);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i3) {
        return decodeInt(this.nativeHandle, str, i3);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        String[] decodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (decodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(decodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    public native boolean isMultiProcess();

    public native boolean isReadOnly();

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z2) {
        encodeBool(this.nativeHandle, str, z2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        encodeFloat(this.nativeHandle, str, f10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i3) {
        encodeInt(this.nativeHandle, str, i3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
        return this;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException(StubApp.getString2(16175));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        removeValueForKey(this.nativeHandle, str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException(StubApp.getString2(16175));
    }
}
