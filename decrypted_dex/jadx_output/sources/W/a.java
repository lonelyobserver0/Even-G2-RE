package W;

import C.AbstractC0025b;
import D9.l;
import F7.k;
import W4.j;
import W4.q;
import Xa.AbstractActivityC0364d;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioDeviceInfo;
import android.media.MicrophoneInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.InterfaceC0444t;
import com.mapbox.common.SdkInformation;
import com.mapbox.navigator.ConfigHandle;
import com.mapbox.navigator.HistoryRecorderHandle;
import com.mapbox.navigator.SdkHistoryInfo;
import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import r0.C1553n;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8056a = true;

    public static ArrayList A(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add(StubApp.getString2(6769) + th.getCause() + StubApp.getString2(604) + Log.getStackTraceString(th));
        return arrayList;
    }

    public static int B(int i3) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i3) {
                return i11;
            }
        }
        return 1;
    }

    public static void a(InterfaceC1708h interfaceC1708h) {
        if (interfaceC1708h != null) {
            try {
                interfaceC1708h.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Uri b(Uri uri, int i3, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File createTempFile = File.createTempFile(E1.a.k(StubApp.getString2("6771"), new SimpleDateFormat(StubApp.getString2("6770")).format(new Date()), StubApp.getString2("4956")), StubApp.getString2("6772"), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                decodeStream.compress(Bitmap.CompressFormat.JPEG, i3, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri fromFile = Uri.fromFile(createTempFile);
                if (openInputStream != null) {
                    openInputStream.close();
                }
                return fromFile;
            } finally {
            }
        } catch (FileNotFoundException e10) {
            throw new RuntimeException(e10);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static ArrayList c(MicrophoneInfo.Coordinate3F coordinate) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        return CollectionsKt.arrayListOf(Double.valueOf(coordinate.x), Double.valueOf(coordinate.y), Double.valueOf(coordinate.z));
    }

    public static final AnimatorSet d(ArrayList animators) {
        Intrinsics.checkNotNullParameter(animators, "animators");
        AnimatorSet animatorSet = new AnimatorSet();
        Object[] array = animators.toArray(new Animator[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Animator[] animatorArr = (Animator[]) array;
        animatorSet.playTogether((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        return animatorSet;
    }

    public static Z8.h e(ConfigHandle config, String str, String str2, SdkInformation sdkInformation) {
        HistoryRecorderHandle historyRecorderHandle;
        HistoryRecorderHandle historyRecorderHandle2;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sdkInformation, "sdkInformation");
        SdkHistoryInfo sdkHistoryInfo = new SdkHistoryInfo(sdkInformation.getVersion(), sdkInformation.getName());
        String string2 = StubApp.getString2(6773);
        HistoryRecorderHandle historyRecorderHandle3 = null;
        String string22 = StubApp.getString2(6774);
        if (str != null) {
            historyRecorderHandle = HistoryRecorderHandle.build(str, sdkHistoryInfo, config);
            if (historyRecorderHandle == null) {
                l.e(string2, string22);
            }
        } else {
            historyRecorderHandle = null;
        }
        if (str2 != null) {
            historyRecorderHandle2 = HistoryRecorderHandle.build(str2, sdkHistoryInfo, config);
            if (historyRecorderHandle2 == null) {
                l.e(string2, string22);
            }
        } else {
            historyRecorderHandle2 = null;
        }
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new HistoryRecorderHandle[]{historyRecorderHandle, historyRecorderHandle2});
        if (!listOfNotNull.isEmpty() && (historyRecorderHandle3 = HistoryRecorderHandle.buildCompositeRecorder(listOfNotNull)) == null) {
            l.e(StubApp.getString2(6775), string22);
        }
        return new Z8.h(historyRecorderHandle, historyRecorderHandle2, historyRecorderHandle3);
    }

    public static void f(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (W4.g gVar : (Set) it2.next()) {
                        for (W4.i iVar : gVar.f8132a.f8117c) {
                            if (iVar.f8139c == 0) {
                                Set<W4.g> set = (Set) hashMap.get(new W4.h(iVar.f8137a, iVar.f8138b == 2));
                                if (set != null) {
                                    for (W4.g gVar2 : set) {
                                        gVar.f8133b.add(gVar2);
                                        gVar2.f8134c.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    W4.g gVar3 = (W4.g) it4.next();
                    if (gVar3.f8134c.isEmpty()) {
                        hashSet2.add(gVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    W4.g gVar4 = (W4.g) hashSet2.iterator().next();
                    hashSet2.remove(gVar4);
                    i3++;
                    Iterator it5 = gVar4.f8133b.iterator();
                    while (it5.hasNext()) {
                        W4.g gVar5 = (W4.g) it5.next();
                        gVar5.f8134c.remove(gVar4);
                        if (gVar5.f8134c.isEmpty()) {
                            hashSet2.add(gVar5);
                        }
                    }
                }
                if (i3 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    W4.g gVar6 = (W4.g) it6.next();
                    if (!gVar6.f8134c.isEmpty() && !gVar6.f8133b.isEmpty()) {
                        arrayList2.add(gVar6.f8132a);
                    }
                }
                throw new j(StubApp.getString2(6777) + Arrays.toString(arrayList2.toArray()));
            }
            W4.b bVar = (W4.b) it.next();
            W4.g gVar7 = new W4.g(bVar);
            for (q qVar : bVar.f8116b) {
                boolean z2 = bVar.f8119e == 0;
                W4.h hVar = new W4.h(qVar, !z2);
                if (!hashMap.containsKey(hVar)) {
                    hashMap.put(hVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(hVar);
                if (!set2.isEmpty() && z2) {
                    throw new IllegalArgumentException(StubApp.getString2(6776) + qVar + StubApp.getString2(1));
                }
                set2.add(gVar7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(android.content.Context r3, java.lang.String r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto Le
            boolean r1 = o(r3, r2, r4)
            if (r1 == 0) goto Le
            return r4
        Le:
            r4 = 29
            r1 = 140(0x8c, float:1.96E-43)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            if (r0 >= r4) goto L2e
            boolean r4 = o(r3, r2, r1)
            if (r4 == 0) goto L20
            goto L34
        L20:
            r4 = 141(0x8d, float:1.98E-43)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            boolean r3 = o(r3, r2, r4)
            if (r3 == 0) goto L35
            return r4
        L2e:
            boolean r3 = o(r3, r2, r1)
            if (r3 == 0) goto L35
        L34:
            return r1
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W.a.g(android.content.Context, java.lang.String):java.lang.String");
    }

    public static int h(AbstractActivityC0364d abstractActivityC0364d, String str) {
        if (abstractActivityC0364d != null) {
            SharedPreferences sharedPreferences = abstractActivityC0364d.getSharedPreferences(str, 0);
            String string2 = StubApp.getString2(6778);
            boolean z2 = sharedPreferences.getBoolean(string2, false);
            boolean e10 = AbstractC0025b.e(abstractActivityC0364d, str);
            if (z2) {
                e10 = !e10;
            }
            if (!z2 && e10) {
                abstractActivityC0364d.getSharedPreferences(str, 0).edit().putBoolean(string2, true).apply();
            }
            if (z2 && e10) {
                return 4;
            }
        }
        return 0;
    }

    public static Map i(AudioDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        String address = device.getAddress();
        Pair pair = TuplesKt.to(StubApp.getString2(290), Integer.valueOf(device.getId()));
        Pair pair2 = TuplesKt.to(StubApp.getString2(6779), device.getProductName());
        Pair pair3 = TuplesKt.to(StubApp.getString2(661), address);
        Pair pair4 = TuplesKt.to(StubApp.getString2(6780), Boolean.valueOf(device.isSource()));
        Pair pair5 = TuplesKt.to(StubApp.getString2(6781), Boolean.valueOf(device.isSink()));
        int[] sampleRates = device.getSampleRates();
        Intrinsics.checkNotNullExpressionValue(sampleRates, "getSampleRates(...)");
        Pair pair6 = TuplesKt.to(StubApp.getString2(6782), p(sampleRates));
        int[] channelMasks = device.getChannelMasks();
        Intrinsics.checkNotNullExpressionValue(channelMasks, "getChannelMasks(...)");
        Pair pair7 = TuplesKt.to(StubApp.getString2(6783), p(channelMasks));
        int[] channelIndexMasks = device.getChannelIndexMasks();
        Intrinsics.checkNotNullExpressionValue(channelIndexMasks, "getChannelIndexMasks(...)");
        Pair pair8 = TuplesKt.to(StubApp.getString2(6784), p(channelIndexMasks));
        int[] channelCounts = device.getChannelCounts();
        Intrinsics.checkNotNullExpressionValue(channelCounts, "getChannelCounts(...)");
        Pair pair9 = TuplesKt.to(StubApp.getString2(6785), p(channelCounts));
        int[] encodings = device.getEncodings();
        Intrinsics.checkNotNullExpressionValue(encodings, "getEncodings(...)");
        return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to(StubApp.getString2(6786), p(encodings)), TuplesKt.to(StubApp.getString2(660), Integer.valueOf(device.getType())));
    }

    public static String j(Class cls, Object obj) {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return (String) cls.getMethod(StubApp.getString2("6787"), new Class[0]).invoke(obj, new Object[0]);
            }
            File file = (File) cls.getMethod(StubApp.getString2("6788"), new Class[0]).invoke(obj, new Object[0]);
            if (file != null) {
                return file.getPath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String k(AbstractActivityC0364d abstractActivityC0364d, Uri uri) {
        Uri uri2;
        int lastIndexOf;
        String string2 = StubApp.getString2(1245);
        String str = null;
        try {
            if (uri.getScheme().equals(StubApp.getString2("1248"))) {
                uri2 = uri;
                Cursor query = abstractActivityC0364d.getContentResolver().query(uri2, new String[]{string2}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow(string2));
                        }
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            } else {
                uri2 = uri;
            }
            return (str != null || (lastIndexOf = (str = uri2.getPath()).lastIndexOf(47)) == -1) ? str : str.substring(lastIndexOf + 1);
        } catch (Exception e10) {
            Log.e(StubApp.getString2(4491), StubApp.getString2(6789) + e10.toString());
            return str;
        }
    }

    public static Long l(Object obj) {
        Long l9 = obj instanceof Long ? (Long) obj : null;
        if (l9 != null) {
            return l9;
        }
        if ((obj instanceof Integer ? (Integer) obj : null) != null) {
            return Long.valueOf(r2.intValue());
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x018e, code lost:
    
        if (r6 != false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m(android.content.Context r5, int r6) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.a.m(android.content.Context, int):java.util.ArrayList");
    }

    public static String[] n(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (true) {
            int size = arrayList.size();
            String string2 = StubApp.getString2(4491);
            if (i3 >= size) {
                Log.d(string2, StubApp.getString2(6795) + arrayList2);
                return (String[]) arrayList2.toArray(new String[0]);
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i3));
            if (mimeTypeFromExtension == null) {
                Log.w(string2, StubApp.getString2(6793) + ((String) arrayList.get(i3)) + StubApp.getString2(6794));
            } else {
                arrayList2.add(mimeTypeFromExtension);
            }
            i3++;
        }
    }

    public static boolean o(Context context, ArrayList arrayList, String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        String string2 = StubApp.getString2(1797);
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                Log.d(string2, StubApp.getString2(6798), e10);
            }
        }
        if (context == null) {
            Log.d(string2, StubApp.getString2("6796"));
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 4096);
        }
        if (packageInfo == null) {
            Log.d(string2, StubApp.getString2("6797"));
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList p(int[] a3) {
        Intrinsics.checkNotNullParameter(a3, "a");
        return new ArrayList(ArraysKt.toList(a3));
    }

    public static final boolean q(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        int ordinal = kVar.f2319d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2 && ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static O9.a r(AbstractActivityC0364d abstractActivityC0364d, Uri uri, boolean z2) {
        Exception exc;
        FileOutputStream fileOutputStream;
        String str = StubApp.getString2(6799) + uri.toString();
        String string2 = StubApp.getString2(4491);
        Log.i(string2, str);
        String k3 = k(abstractActivityC0364d, uri);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(abstractActivityC0364d.getCacheDir().getAbsolutePath());
        sb2.append(StubApp.getString2(4489));
        sb2.append(System.currentTimeMillis());
        sb2.append(StubApp.getString2(601));
        sb2.append(k3 != null ? k3 : StubApp.getString2(6800));
        String sb3 = sb2.toString();
        File file = new File(sb3);
        boolean exists = file.exists();
        String string22 = StubApp.getString2(6801);
        byte[] bArr = null;
        if (!exists) {
            file.getParentFile().mkdirs();
            try {
                fileOutputStream = new FileOutputStream(sb3);
                try {
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        InputStream openInputStream = abstractActivityC0364d.getContentResolver().openInputStream(uri);
                        byte[] bArr2 = new byte[8192];
                        while (true) {
                            int read = openInputStream.read(bArr2);
                            if (read < 0) {
                                break;
                            }
                            bufferedOutputStream.write(bArr2, 0, read);
                        }
                        bufferedOutputStream.flush();
                        fileOutputStream.getFD().sync();
                    } catch (Exception e10) {
                        exc = e10;
                        try {
                            fileOutputStream.close();
                            Log.e(string2, StubApp.getString2(6802) + exc.getMessage(), null);
                            return null;
                        } catch (IOException | NullPointerException unused) {
                            Log.e(string2, string22 + exc.getMessage(), null);
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    fileOutputStream.getFD().sync();
                    throw th;
                }
            } catch (Exception e11) {
                exc = e11;
                fileOutputStream = null;
            }
        }
        Log.d(string2, StubApp.getString2(6803) + sb3);
        if (z2) {
            String string23 = StubApp.getString2(6804);
            try {
                int length = (int) file.length();
                byte[] bArr3 = new byte[length];
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bufferedInputStream.read(bArr3, 0, length);
                    bufferedInputStream.close();
                } catch (FileNotFoundException e12) {
                    Log.e(string2, string23 + e12.getMessage(), null);
                } catch (IOException e13) {
                    Log.e(string2, string22 + e13.getMessage(), null);
                }
                bArr = bArr3;
            } catch (Exception e14) {
                Log.e(string2, StubApp.getString2(6805) + e14.toString() + StubApp.getString2(6806));
            }
        }
        return new O9.a(sb3, k3, uri, Long.parseLong(String.valueOf(file.length())), bArr);
    }

    public static long s(C1553n c1553n, int i3, int i10) {
        c1553n.G(i3);
        if (c1553n.a() < 5) {
            return -9223372036854775807L;
        }
        int h2 = c1553n.h();
        if ((8388608 & h2) != 0 || ((2096896 & h2) >> 8) != i10 || (h2 & 32) == 0 || c1553n.u() < 7 || c1553n.a() < 7 || (c1553n.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        c1553n.f(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static void t(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                t(file2);
            }
        }
        file.delete();
    }

    public static E0 u(InterfaceC0444t interfaceC0444t, H8.d dVar, Function0 function0) {
        Intrinsics.checkNotNullParameter(interfaceC0444t, "<this>");
        return new E0(interfaceC0444t, dVar, function0);
    }

    public static final boolean v(Float f10, Float f11) {
        return Float.compare(f10.floatValue(), f11.floatValue()) == 0;
    }

    public static void w(Window window) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            G.a.e(window);
        } else if (i3 >= 30) {
            G.a.d(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    public static Integer x(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    public static void y(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z2);
        } else if (f8056a) {
            try {
                viewGroup.suppressLayout(z2);
            } catch (NoSuchMethodError unused) {
                f8056a = false;
            }
        }
    }

    public static int z(AbstractActivityC0364d abstractActivityC0364d, String str, int i3) {
        if (i3 == -1) {
            return h(abstractActivityC0364d, str);
        }
        return 1;
    }
}
