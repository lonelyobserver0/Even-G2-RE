package t0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.stub.StubApp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import r0.AbstractC1560u;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1705e extends AbstractC1703c {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f21060e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f21061f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f21062g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f21063h;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21064k;

    public C1705e(Context context) {
        super(false);
        this.f21060e = context.getContentResolver();
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        this.f21061f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f21063h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f21063h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21062g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new C1704d(2000, e10);
                    }
                } finally {
                    this.f21062g = null;
                    if (this.f21064k) {
                        this.f21064k = false;
                        d();
                    }
                }
            } catch (IOException e11) {
                throw new C1704d(2000, e11);
            }
        } catch (Throwable th) {
            this.f21063h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f21062g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f21062g = null;
                    if (this.f21064k) {
                        this.f21064k = false;
                        d();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new C1704d(2000, e12);
                }
            } finally {
                this.f21062g = null;
                if (this.f21064k) {
                    this.f21064k = false;
                    d();
                }
            }
        }
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        int i3;
        AssetFileDescriptor openAssetFileDescriptor;
        String string2 = StubApp.getString2(23384);
        try {
            try {
                Uri normalizeScheme = c1711k.f21077a.normalizeScheme();
                this.f21061f = normalizeScheme;
                g();
                boolean equals = StubApp.getString2("1248").equals(normalizeScheme.getScheme());
                ContentResolver contentResolver = this.f21060e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(StubApp.getString2("23385"), true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, StubApp.getString2("627"), bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, StubApp.getString2("1269"));
                }
                this.f21062g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i3 = 2000;
                    try {
                        throw new C1704d(2000, new IOException(string2 + normalizeScheme));
                    } catch (IOException e10) {
                        e = e10;
                        if (e instanceof FileNotFoundException) {
                            i3 = 2005;
                        }
                        throw new C1704d(i3, e);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f21063h = fileInputStream;
                long j = c1711k.f21081e;
                if (length != -1 && j > length) {
                    throw new C1704d(2008, null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j) - startOffset;
                if (skip != j) {
                    throw new C1704d(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.j = -1L;
                    } else {
                        long position = size - channel.position();
                        this.j = position;
                        if (position < 0) {
                            throw new C1704d(2008, null);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.j = j3;
                    if (j3 < 0) {
                        throw new C1704d(2008, null);
                    }
                }
                long j10 = c1711k.f21082f;
                if (j10 != -1) {
                    long j11 = this.j;
                    this.j = j11 == -1 ? j10 : Math.min(j11, j10);
                }
                this.f21064k = true;
                j(c1711k);
                return j10 != -1 ? j10 : this.j;
            } catch (IOException e11) {
                e = e11;
                i3 = 2000;
            }
        } catch (C1704d e12) {
            throw e12;
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
                    throw new C1704d(2000, e10);
                }
            }
            FileInputStream fileInputStream = this.f21063h;
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
        }
        return -1;
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f21061f;
    }
}
