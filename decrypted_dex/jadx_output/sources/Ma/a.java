package Ma;

import La.d;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4695a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f4696b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f4697c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f4698d;

    /* renamed from: e, reason: collision with root package name */
    public float f4699e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4700f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4701g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4702h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap.CompressFormat f4703i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4704k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4705l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f4706m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f4707n;

    /* renamed from: o, reason: collision with root package name */
    public final Ja.c f4708o;

    /* renamed from: p, reason: collision with root package name */
    public int f4709p;

    /* renamed from: q, reason: collision with root package name */
    public int f4710q;

    /* renamed from: r, reason: collision with root package name */
    public int f4711r;

    /* renamed from: s, reason: collision with root package name */
    public int f4712s;

    public a(Context context, Bitmap bitmap, d dVar, La.b bVar, Ja.c cVar) {
        this.f4695a = new WeakReference(context);
        this.f4696b = bitmap;
        this.f4697c = dVar.f4393a;
        this.f4698d = dVar.f4394b;
        this.f4699e = dVar.f4395c;
        this.f4700f = dVar.f4396d;
        this.f4701g = bVar.f4382a;
        this.f4702h = bVar.f4383b;
        this.f4703i = (Bitmap.CompressFormat) bVar.f4385d;
        this.j = bVar.f4384c;
        this.f4704k = (String) bVar.f4386e;
        this.f4705l = (String) bVar.f4387f;
        this.f4706m = (Uri) bVar.f4388g;
        this.f4707n = (Uri) bVar.f4389h;
        this.f4708o = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0294 -> B:101:0x0375). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x021b -> B:51:0x0375). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ma.a.a():void");
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap bitmap = this.f4696b;
        if (bitmap == null) {
            return new NullPointerException(StubApp.getString2(3570));
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException(StubApp.getString2(3571));
        }
        if (this.f4698d.isEmpty()) {
            return new NullPointerException(StubApp.getString2(3572));
        }
        if (this.f4707n == null) {
            return new NullPointerException(StubApp.getString2(3573));
        }
        try {
            a();
            this.f4696b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Throwable th = (Throwable) obj;
        Ja.c cVar = this.f4708o;
        if (cVar != null) {
            UCropActivity uCropActivity = (UCropActivity) cVar.f3470b;
            if (th != null) {
                uCropActivity.v(th);
                uCropActivity.finish();
                return;
            }
            Uri uri = this.f4707n;
            if (uri == null || !StubApp.getString2(1248).equals(uri.getScheme())) {
                uri = Uri.fromFile(new File(this.f4705l));
            }
            int i3 = this.f4711r;
            int i10 = this.f4712s;
            int i11 = this.f4709p;
            uCropActivity.setResult(-1, new Intent().putExtra(StubApp.getString2(3574), uri).putExtra(StubApp.getString2(3575), uCropActivity.f12971R.getTargetAspectRatio()).putExtra(StubApp.getString2(3576), i11).putExtra(StubApp.getString2(3577), this.f4710q).putExtra(StubApp.getString2(3578), i3).putExtra(StubApp.getString2(3579), i10));
            uCropActivity.finish();
        }
    }
}
