package t0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.stub.StubApp;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import p0.AbstractC1482f;
import r0.AbstractC1560u;

/* renamed from: t0.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1724x extends AbstractC1703c {

    /* renamed from: e, reason: collision with root package name */
    public final Context f21118e;

    /* renamed from: f, reason: collision with root package name */
    public C1711k f21119f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f21120g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f21121h;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21122k;

    public C1724x(Context context) {
        super(false);
        this.f21118e = StubApp.getOrigApplicationContext(context.getApplicationContext());
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i3) {
        return Uri.parse(StubApp.getString2(23420) + i3);
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        this.f21119f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f21121h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f21121h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21120g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new C1723w(null, e10, 2000);
                    }
                } finally {
                    this.f21120g = null;
                    if (this.f21122k) {
                        this.f21122k = false;
                        d();
                    }
                }
            } catch (IOException e11) {
                throw new C1723w(null, e11, 2000);
            }
        } catch (Throwable th) {
            this.f21121h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f21120g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f21120g = null;
                    if (this.f21122k) {
                        this.f21122k = false;
                        d();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new C1723w(null, e12, 2000);
                }
            } finally {
                this.f21120g = null;
                if (this.f21122k) {
                    this.f21122k = false;
                    d();
                }
            }
        }
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        Resources resourcesForApplication;
        int parseInt;
        int i3;
        Resources resources;
        this.f21119f = c1711k;
        g();
        Uri normalizeScheme = c1711k.f21077a.normalizeScheme();
        boolean equals = TextUtils.equals(StubApp.getString2(23399), normalizeScheme.getScheme());
        String string2 = StubApp.getString2(23421);
        Context context = this.f21118e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C1723w(StubApp.getString2(23422) + pathSegments.size(), null, 2000);
            }
            try {
                i3 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C1723w(string2, null, 1004);
            }
        } else {
            if (!TextUtils.equals(StubApp.getString2(9813), normalizeScheme.getScheme())) {
                throw new C1723w(StubApp.getString2(23426) + normalizeScheme.getScheme() + StubApp.getString2(23427), null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(StubApp.getString2(601))) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new C1723w(StubApp.getString2(23425), e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C1723w(string2, null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(AbstractC1482f.h(packageName, StubApp.getString2(478), path), StubApp.getString2(5108), null);
                if (parseInt == 0) {
                    throw new C1723w(StubApp.getString2(23424), null, 2005);
                }
            }
            i3 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i3);
            if (openRawResourceFd == null) {
                throw new C1723w(StubApp.getString2(23423) + normalizeScheme, null, 2000);
            }
            this.f21120g = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f21120g.getFileDescriptor());
            this.f21121h = fileInputStream;
            long j = c1711k.f21081e;
            try {
                if (length != -1 && j > length) {
                    throw new C1723w(null, null, 2008);
                }
                long startOffset = this.f21120g.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j) - startOffset;
                if (skip != j) {
                    throw new C1723w(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.j = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.j = size;
                        if (size < 0) {
                            throw new C1723w(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.j = j3;
                    if (j3 < 0) {
                        throw new C1709i(2008);
                    }
                }
                long j10 = c1711k.f21082f;
                if (j10 != -1) {
                    long j11 = this.j;
                    this.j = j11 == -1 ? j10 : Math.min(j11, j10);
                }
                this.f21122k = true;
                j(c1711k);
                return j10 != -1 ? j10 : this.j;
            } catch (C1723w e11) {
                throw e11;
            } catch (IOException e12) {
                throw new C1723w(null, e12, 2000);
            }
        } catch (Resources.NotFoundException e13) {
            throw new C1723w(null, e13, 2005);
        }
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j = this.j;
        if (j != 0) {
            if (j != -1) {
                try {
                    i10 = (int) Math.min(j, i10);
                } catch (IOException e10) {
                    throw new C1723w(null, e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.f21121h;
            int i11 = AbstractC1560u.f20190a;
            int read = fileInputStream.read(bArr, i3, i10);
            if (read != -1) {
                long j3 = this.j;
                if (j3 != -1) {
                    this.j = j3 - read;
                }
                a(read);
                return read;
            }
            if (this.j != -1) {
                throw new C1723w(StubApp.getString2(23428), new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        C1711k c1711k = this.f21119f;
        if (c1711k != null) {
            return c1711k.f21077a;
        }
        return null;
    }
}
