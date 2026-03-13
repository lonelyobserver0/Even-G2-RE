package t0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.stub.StubApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import r0.AbstractC1560u;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1702b extends AbstractC1703c {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f21052e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f21053f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f21054g;

    /* renamed from: h, reason: collision with root package name */
    public long f21055h;
    public boolean j;

    public C1702b(Context context) {
        super(false);
        this.f21052e = context.getAssets();
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        this.f21053f = null;
        try {
            try {
                InputStream inputStream = this.f21054g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new C1701a(2000, e10);
            }
        } finally {
            this.f21054g = null;
            if (this.j) {
                this.j = false;
                d();
            }
        }
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        try {
            Uri uri = c1711k.f21077a;
            long j = c1711k.f21081e;
            this.f21053f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith(StubApp.getString2("23383"))) {
                path = path.substring(15);
            } else if (path.startsWith(StubApp.getString2("601"))) {
                path = path.substring(1);
            }
            g();
            InputStream open = this.f21052e.open(path, 1);
            this.f21054g = open;
            if (open.skip(j) < j) {
                throw new C1701a(2008, null);
            }
            long j3 = c1711k.f21082f;
            if (j3 != -1) {
                this.f21055h = j3;
            } else {
                long available = this.f21054g.available();
                this.f21055h = available;
                if (available == 2147483647L) {
                    this.f21055h = -1L;
                }
            }
            this.j = true;
            j(c1711k);
            return this.f21055h;
        } catch (C1701a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C1701a(e11 instanceof FileNotFoundException ? 2005 : 2000, e11);
        }
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f21055h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e10) {
                    throw new C1701a(2000, e10);
                }
            }
            InputStream inputStream = this.f21054g;
            int i11 = AbstractC1560u.f20190a;
            int read = inputStream.read(bArr, i3, i10);
            if (read != -1) {
                long j3 = this.f21055h;
                if (j3 != -1) {
                    this.f21055h = j3 - read;
                }
                a(read);
                return read;
            }
        }
        return -1;
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f21053f;
    }
}
