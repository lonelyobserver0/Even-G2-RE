package Ta;

import android.content.Context;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class g {
    public static boolean a(Context context, String assetsFilePath, String destFilePath) {
        String string2 = StubApp.getString2(601);
        Intrinsics.checkNotNullParameter(assetsFilePath, "assetsFilePath");
        Intrinsics.checkNotNullParameter(destFilePath, "destFilePath");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String[] list = StubApp.getOrigApplicationContext(context.getApplicationContext()).getAssets().list(assetsFilePath);
            if (list != null && list.length != 0) {
                Iterator it = ArrayIteratorKt.iterator(list);
                boolean z2 = true;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    z2 &= a(context, assetsFilePath + string2 + str, destFilePath + string2 + str);
                }
                return z2;
            }
            InputStream open = StubApp.getOrigApplicationContext(context.getApplicationContext()).getAssets().open(assetsFilePath);
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            return b(destFilePath, open);
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r6, java.io.InputStream r7) {
        /*
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L5
            goto L1f
        L5:
            int r2 = r6.length()
            r3 = r1
        La:
            if (r3 >= r2) goto L1f
            char r4 = r6.charAt(r3)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 != 0) goto L1c
            java.io.File r2 = new java.io.File
            r2.<init>(r6)
            goto L20
        L1c:
            int r3 = r3 + 1
            goto La
        L1f:
            r2 = r0
        L20:
            r6 = 1
            if (r2 != 0) goto L25
        L23:
            r3 = r1
            goto L57
        L25:
            boolean r3 = r2.exists()
            if (r3 == 0) goto L30
            boolean r3 = r2.isFile()
            goto L57
        L30:
            java.io.File r3 = r2.getParentFile()
            if (r3 == 0) goto L49
            boolean r4 = r3.exists()
            if (r4 == 0) goto L41
            boolean r3 = r3.isDirectory()
            goto L45
        L41:
            boolean r3 = r3.mkdirs()
        L45:
            if (r3 == 0) goto L49
            r3 = r6
            goto L4a
        L49:
            r3 = r1
        L4a:
            if (r3 != 0) goto L4d
            goto L23
        L4d:
            boolean r3 = r2.createNewFile()     // Catch: java.io.IOException -> L52
            goto L57
        L52:
            r3 = move-exception
            r3.printStackTrace()
            goto L23
        L57:
            if (r3 == 0) goto Lba
            if (r7 != 0) goto L5d
            goto Lba
        L5d:
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
        L6b:
            int r4 = r7.read(r2, r1, r0)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            r5 = -1
            if (r4 == r5) goto L7c
            r3.write(r2, r1, r4)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            goto L6b
        L76:
            r6 = move-exception
            r0 = r3
            goto La7
        L79:
            r6 = move-exception
            r0 = r3
            goto L91
        L7c:
            r7.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r7 = move-exception
            r7.printStackTrace()
        L84:
            r3.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r7 = move-exception
            r7.printStackTrace()
        L8c:
            r1 = r6
            goto Lba
        L8e:
            r6 = move-exception
            goto La7
        L90:
            r6 = move-exception
        L91:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L8e
            r7.close()     // Catch: java.io.IOException -> L98
            goto L9c
        L98:
            r6 = move-exception
            r6.printStackTrace()
        L9c:
            if (r0 == 0) goto Lba
            r0.close()     // Catch: java.io.IOException -> La2
            goto Lba
        La2:
            r6 = move-exception
            r6.printStackTrace()
            goto Lba
        La7:
            r7.close()     // Catch: java.io.IOException -> Lab
            goto Laf
        Lab:
            r7 = move-exception
            r7.printStackTrace()
        Laf:
            if (r0 == 0) goto Lb9
            r0.close()     // Catch: java.io.IOException -> Lb5
            goto Lb9
        Lb5:
            r7 = move-exception
            r7.printStackTrace()
        Lb9:
            throw r6
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ta.g.b(java.lang.String, java.io.InputStream):boolean");
    }
}
