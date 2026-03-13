package c5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f10874a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized long a(Context context) {
        long j;
        synchronized (f.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(StubApp.getString2("2680"))).getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        }
        return j;
    }

    public static void b(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e(StubApp.getString2(280), str, e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int c() {
        boolean f10 = f();
        ?? r02 = f10;
        if (g()) {
            r02 = (f10 ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r02 | 4 : r02;
    }

    public static int d(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i3 = StubApp.getOrigApplicationContext(context.getApplicationContext()).getApplicationInfo().icon;
        if (i3 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i3);
                if (StubApp.getString2("3400").equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String e(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b2 = bArr[i3];
            int i10 = b2 & UByte.MAX_VALUE;
            int i11 = i3 * 2;
            char[] cArr2 = f10874a;
            cArr[i11] = cArr2[i10 >>> 4];
            cArr[i11 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean f() {
        if (Build.PRODUCT.contains(StubApp.getString2(5886))) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains(StubApp.getString2(5880)) || str.contains(StubApp.getString2(5881));
    }

    public static boolean g() {
        boolean f10 = f();
        String str = Build.TAGS;
        if ((f10 || str == null || !str.contains(StubApp.getString2(9460))) && !new File(StubApp.getString2(9461)).exists()) {
            return !f10 && new File(StubApp.getString2(9462)).exists();
        }
        return true;
    }

    public static String h(String str) {
        String string2 = StubApp.getString2(5778);
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string2);
            messageDigest.update(bytes);
            return e(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e(StubApp.getString2(280), StubApp.getString2(9463), e10);
            return "";
        }
    }

    public static String i(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter(StubApp.getString2(9464));
        try {
            String next = useDelimiter.hasNext() ? useDelimiter.next() : "";
            useDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
