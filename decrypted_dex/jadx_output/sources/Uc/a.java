package Uc;

import I4.e;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.content.SharedPreferences;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0364d f7625a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f7626b;

    /* renamed from: c, reason: collision with root package name */
    public final e f7627c;

    /* renamed from: d, reason: collision with root package name */
    public MethodChannel.Result f7628d;

    public a(AbstractActivityC0364d abstractActivityC0364d) {
        this.f7625a = abstractActivityC0364d;
        Context origApplicationContext = StubApp.getOrigApplicationContext(abstractActivityC0364d.getApplicationContext());
        this.f7626b = origApplicationContext.getSharedPreferences(origApplicationContext.getPackageName() + StubApp.getString2(20340), 0);
        this.f7627c = new e(21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af A[Catch: IOException -> 0x01b2, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x01b2, blocks: (B:37:0x018a, B:52:0x01af), top: B:12:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3, types: [Xa.d, android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.a.onActivityResult(int, int, android.content.Intent):boolean");
    }
}
