package Ma;

import Oa.e;
import a4.f;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4716a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f4717b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f4718c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4720e;

    /* renamed from: f, reason: collision with root package name */
    public final F5.c f4721f;

    public c(Context context, Uri uri, Uri uri2, int i3, int i10, F5.c cVar) {
        this.f4716a = new WeakReference(context);
        this.f4717b = uri;
        this.f4718c = uri2;
        this.f4719d = i3;
        this.f4720e = i10;
        this.f4721f = cVar;
    }

    public final void a(Uri uri, Uri uri2) {
        InputStream inputStream;
        Uri uri3 = this.f4718c;
        Log.d(StubApp.getString2(3580), StubApp.getString2(3581));
        if (uri2 == null) {
            throw new NullPointerException(StubApp.getString2(3583));
        }
        Context context = (Context) this.f4716a.get();
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (inputStream == null) {
                    throw new NullPointerException(StubApp.getString2("3582"));
                }
                OutputStream openOutputStream = uri2.getScheme().equals(StubApp.getString2("1248")) ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        f.f(openOutputStream);
                        f.f(inputStream);
                        this.f4717b = uri3;
                        return;
                    }
                    openOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                th = th;
                f.f(null);
                f.f(inputStream);
                this.f4717b = uri3;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.net.Uri r9, android.net.Uri r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ma.c.b(android.net.Uri, android.net.Uri):void");
    }

    public final void c() {
        String str = StubApp.getString2(3588) + this.f4717b.getScheme();
        String string2 = StubApp.getString2(3580);
        Log.d(string2, str);
        String scheme = this.f4717b.getScheme();
        boolean equals = scheme.equals(StubApp.getString2(3589));
        Uri uri = this.f4718c;
        if (equals || scheme.equals(StubApp.getString2(3396))) {
            try {
                b(this.f4717b, uri);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e(string2, StubApp.getString2(3593), e10);
                throw e10;
            }
        }
        if (this.f4717b.getScheme().equals(StubApp.getString2(1248))) {
            try {
                a(this.f4717b, uri);
                return;
            } catch (IOException | NullPointerException e11) {
                Log.e(string2, StubApp.getString2(3590), e11);
                throw e11;
            }
        }
        if (this.f4717b.getScheme().equals(StubApp.getString2(3105))) {
            return;
        }
        String scheme2 = this.f4717b.getScheme();
        Log.e(string2, StubApp.getString2(3591) + scheme2);
        throw new IllegalArgumentException(E1.a.j(StubApp.getString2(3592), scheme2));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ma.c.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Exception exc = bVar.f4715c;
        F5.c cVar = this.f4721f;
        if (exc != null) {
            cVar.getClass();
            Log.e(StubApp.getString2(3602), StubApp.getString2(3603), exc);
            e eVar = ((Oa.f) cVar.f2238b).f5362k;
            if (eVar != null) {
                UCropActivity uCropActivity = (UCropActivity) ((Ja.c) eVar).f3470b;
                uCropActivity.v(exc);
                uCropActivity.finish();
                return;
            }
            return;
        }
        Uri uri = this.f4717b;
        Oa.f fVar = (Oa.f) cVar.f2238b;
        fVar.f5370t = uri;
        Uri uri2 = this.f4718c;
        fVar.f5371v = uri2;
        fVar.f5368r = uri.getPath();
        fVar.f5369s = uri2 != null ? uri2.getPath() : null;
        fVar.f5372w = bVar.f4714b;
        fVar.f5365n = true;
        fVar.setImageBitmap(bVar.f4713a);
    }
}
