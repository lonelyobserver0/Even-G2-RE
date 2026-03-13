package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import com.stub.StubApp;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0624h2 {

    /* renamed from: a, reason: collision with root package name */
    public static AssetManager f11579a = null;

    /* renamed from: b, reason: collision with root package name */
    public static float f11580b = 0.3f;

    public static ArrayList B(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add(StubApp.getString2(6769) + th.getCause() + StubApp.getString2(604) + Log.getStackTraceString(th));
        return arrayList;
    }

    public static String C(C0594b2 c0594b2) {
        StringBuilder sb2 = new StringBuilder(c0594b2.c());
        for (int i3 = 0; i3 < c0594b2.c(); i3++) {
            byte a3 = c0594b2.a(i3);
            if (a3 == 34) {
                sb2.append(StubApp.getString2(11658));
            } else if (a3 == 39) {
                sb2.append(StubApp.getString2(11657));
            } else if (a3 != 92) {
                switch (a3) {
                    case 7:
                        sb2.append(StubApp.getString2(11655));
                        break;
                    case 8:
                        sb2.append(StubApp.getString2(11654));
                        break;
                    case 9:
                        sb2.append(StubApp.getString2(11653));
                        break;
                    case 10:
                        sb2.append(StubApp.getString2(11652));
                        break;
                    case 11:
                        sb2.append(StubApp.getString2(11651));
                        break;
                    case 12:
                        sb2.append(StubApp.getString2(11650));
                        break;
                    case 13:
                        sb2.append(StubApp.getString2(11649));
                        break;
                    default:
                        if (a3 < 32 || a3 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a3 >>> 6) & 3) + 48));
                            sb2.append((char) (((a3 >>> 3) & 7) + 48));
                            sb2.append((char) ((a3 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a3);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append(StubApp.getString2(11656));
            }
        }
        return sb2.toString();
    }

    public static C0604d2 D() {
        String string2;
        ClassLoader classLoader = AbstractC0624h2.class.getClassLoader();
        if (C0604d2.class.equals(C0604d2.class)) {
            string2 = StubApp.getString2(12073);
        } else {
            if (!C0604d2.class.getPackage().equals(AbstractC0624h2.class.getPackage())) {
                throw new IllegalArgumentException(C0604d2.class.getName());
            }
            string2 = C0604d2.class.getPackage().getName() + StubApp.getString2(12071) + C0604d2.class.getSimpleName() + StubApp.getString2(12072);
        }
        try {
            try {
                try {
                    try {
                        Xa.h.x(Class.forName(string2, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (IllegalAccessException e10) {
                        throw new IllegalStateException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new IllegalStateException(e11);
                    }
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(e12);
                } catch (NoSuchMethodException e13) {
                    throw new IllegalStateException(e13);
                }
            } catch (ClassNotFoundException unused) {
                Iterator it = Arrays.asList(new AbstractC0624h2[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e14) {
                        Logger.getLogger(C0599c2.class.getName()).logp(Level.SEVERE, StubApp.getString2(12076), StubApp.getString2(12077), StubApp.getString2(12075).concat(C0604d2.class.getSimpleName()), (Throwable) e14);
                    }
                }
                if (arrayList.size() == 1) {
                    return (C0604d2) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (C0604d2) C0604d2.class.getMethod(StubApp.getString2("12074"), Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(e15);
                } catch (NoSuchMethodException e16) {
                    throw new IllegalStateException(e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(e17);
                }
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final Bundle a(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(str, null);
            } else if (component2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) component2).booleanValue());
            } else if (component2 instanceof Byte) {
                bundle.putByte(str, ((Number) component2).byteValue());
            } else if (component2 instanceof Character) {
                bundle.putChar(str, ((Character) component2).charValue());
            } else if (component2 instanceof Double) {
                bundle.putDouble(str, ((Number) component2).doubleValue());
            } else if (component2 instanceof Float) {
                bundle.putFloat(str, ((Number) component2).floatValue());
            } else if (component2 instanceof Integer) {
                bundle.putInt(str, ((Number) component2).intValue());
            } else if (component2 instanceof Long) {
                bundle.putLong(str, ((Number) component2).longValue());
            } else if (component2 instanceof Short) {
                bundle.putShort(str, ((Number) component2).shortValue());
            } else if (component2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) component2);
            } else if (component2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) component2);
            } else if (component2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) component2);
            } else {
                boolean z2 = component2 instanceof Object[];
                String string2 = StubApp.getString2(12078);
                if (z2) {
                    Class<?> componentType = component2.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                        bundle.putParcelableArray(str, (Parcelable[]) component2);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                        bundle.putStringArray(str, (String[]) component2);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                        bundle.putCharSequenceArray(str, (CharSequence[]) component2);
                    } else {
                        if (!Serializable.class.isAssignableFrom(componentType)) {
                            throw new IllegalArgumentException(StubApp.getString2(12079) + componentType.getCanonicalName() + string2 + str + Typography.quote);
                        }
                        bundle.putSerializable(str, (Serializable) component2);
                    }
                } else if (component2 instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) component2);
                } else if (component2 instanceof IBinder) {
                    bundle.putBinder(str, (IBinder) component2);
                } else if (component2 instanceof Size) {
                    bundle.putSize(str, (Size) component2);
                } else {
                    if (!(component2 instanceof SizeF)) {
                        throw new IllegalArgumentException(StubApp.getString2(12080) + component2.getClass().getCanonicalName() + string2 + str + Typography.quote);
                    }
                    bundle.putSizeF(str, (SizeF) component2);
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Y.q d(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            r1 = 12081(0x2f31, float:1.6929E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            M.d.e(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            r2 = 12082(0x2f32, float:1.693E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L23
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L23
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L23
            goto L40
        L3f:
            r3 = r4
        L40:
            if (r3 != 0) goto L44
        L42:
            r2 = r4
            goto L80
        L44:
            java.lang.String r1 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
        L56:
            if (r2 >= r6) goto L64
            r7 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            r5.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            int r2 = r2 + 1
            goto L56
        L64:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            K.d r2 = new K.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            java.lang.String r5 = "12083"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            r2.<init>(r1, r3, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            goto L80
        L74:
            r0 = move-exception
            r1 = 12084(0x2f34, float:1.6933E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            android.util.Log.wtf(r1, r0)
            goto L42
        L80:
            if (r2 != 0) goto L83
            goto L8d
        L83:
            Y.q r4 = new Y.q
            Y.p r0 = new Y.p
            r0.<init>(r8, r2)
            r4.<init>(r0)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0624h2.d(android.content.Context):Y.q");
    }

    public static float f(float f10, float f11, float f12, float f13) {
        double d8 = f10 - f12;
        double d10 = f11 - f13;
        return (float) Math.sqrt((d10 * d10) + (d8 * d8));
    }

    public static float g(int i3, int i10, int i11, int i12) {
        double d8 = i3 - i11;
        double d10 = i10 - i12;
        return (float) Math.sqrt((d10 * d10) + (d8 * d8));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean i(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0624h2.i(java.lang.String, java.lang.String):boolean");
    }

    public static MessageDigest j() {
        try {
            return MessageDigest.getInstance(StubApp.getString2("4894"));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static InputStream k(String str) {
        if (f11579a == null) {
            Log.e(StubApp.getString2(948), StubApp.getString2(12085));
        }
        return f11579a.open(str);
    }

    public static boolean n(Context context, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT < 33) {
                packageInfo = packageManager.getPackageInfo(packageName, 4096);
            } else {
                of = PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            }
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    public static boolean o() {
        return f11579a != null;
    }

    public static String v(int i3) {
        switch (i3) {
            case 258:
                return StubApp.getString2(12090);
            case 259:
                return StubApp.getString2(12089);
            case 260:
                return StubApp.getString2(12088);
            case 261:
                return StubApp.getString2(12087);
            case 262:
                return StubApp.getString2(12086);
            default:
                return Xa.h.g(i3, StubApp.getString2(3049), StubApp.getString2(74));
        }
    }

    public static int w(float f10) {
        return (int) (f10 + (f10 < 0.0f ? -0.5f : 0.5f));
    }

    public static int x(int[] iArr) {
        int i3 = 0;
        for (int i10 : iArr) {
            i3 += i10;
        }
        return i3;
    }

    public static String y(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c10 = charArray[i3];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i3] = (char) (c10 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    public static String z(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c10 = charArray[i3];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i3] = (char) (c10 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    public abstract boolean A(View view, int i3);

    public abstract int b(View view, int i3);

    public abstract int c(View view, int i3);

    public abstract String e(int i3, int i10, byte[] bArr);

    public abstract int h(String str, byte[] bArr, int i3, int i10);

    public int l(View view) {
        return 0;
    }

    public int m() {
        return 0;
    }

    public abstract void p(int i3);

    public abstract void q(Typeface typeface, boolean z2);

    public void r(View view, int i3) {
    }

    public abstract void s(int i3);

    public abstract void t(View view, int i3, int i10);

    public abstract void u(View view, float f10, float f11);
}
