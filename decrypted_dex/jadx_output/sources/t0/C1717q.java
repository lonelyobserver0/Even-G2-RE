package t0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.stub.StubApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import r0.AbstractC1560u;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1717q extends AbstractC1703c {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f21109e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f21110f;

    /* renamed from: g, reason: collision with root package name */
    public long f21111g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21112h;

    @Override // t0.InterfaceC1708h
    public final void close() {
        this.f21110f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f21109e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new C1716p(2000, e10);
            }
        } finally {
            this.f21109e = null;
            if (this.f21112h) {
                this.f21112h = false;
                d();
            }
        }
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        Uri uri = c1711k.f21077a;
        long j = c1711k.f21081e;
        this.f21110f = uri;
        g();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, StubApp.getString2("1269"));
            this.f21109e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j3 = c1711k.f21082f;
                if (j3 == -1) {
                    j3 = this.f21109e.length() - j;
                }
                this.f21111g = j3;
                if (j3 < 0) {
                    throw new C1716p(null, null, 2008);
                }
                this.f21112h = true;
                j(c1711k);
                return this.f21111g;
            } catch (IOException e10) {
                throw new C1716p(2000, e10);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C1716p(((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e11);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder t3 = i2.u.t(StubApp.getString2(23412), path2, StubApp.getString2(23413), query, StubApp.getString2(23414));
            t3.append(fragment);
            throw new C1716p(t3.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new C1716p(2006, e12);
        } catch (RuntimeException e13) {
            throw new C1716p(2000, e13);
        }
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.f21111g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f21109e;
            int i11 = AbstractC1560u.f20190a;
            int read = randomAccessFile.read(bArr, i3, (int) Math.min(j, i10));
            if (read > 0) {
                this.f21111g -= read;
                a(read);
            }
            return read;
        } catch (IOException e10) {
            throw new C1716p(2000, e10);
        }
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f21110f;
    }
}
