package Kc;

import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class z extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3860a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Closeable f3861b;

    public z(qa.f fVar) {
        this.f3861b = fVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f3860a) {
            case 0:
                ((A) this.f3861b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        switch (this.f3860a) {
            case 0:
                A a3 = (A) this.f3861b;
                if (!a3.f3772c) {
                    a3.flush();
                    break;
                }
                break;
            default:
                super.flush();
                break;
        }
    }

    public String toString() {
        switch (this.f3860a) {
            case 0:
                return ((A) this.f3861b) + StubApp.getString2(25390);
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i3, int i10) {
        switch (this.f3860a) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                A a3 = (A) this.f3861b;
                if (a3.f3772c) {
                    throw new IOException(StubApp.getString2(1551));
                }
                a3.f3771b.P(data, i3, i10);
                a3.a();
                return;
            default:
                ((qa.f) this.f3861b).h(data, i3, i10);
                return;
        }
    }

    public z(A a3) {
        this.f3861b = a3;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.f3860a) {
            case 1:
                qa.f fVar = (qa.f) this.f3861b;
                fVar.getClass();
                fVar.h(bArr, 0, bArr.length);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        switch (this.f3860a) {
            case 0:
                A a3 = (A) this.f3861b;
                if (!a3.f3772c) {
                    a3.f3771b.Q((byte) i3);
                    a3.a();
                    return;
                }
                throw new IOException(StubApp.getString2(1551));
            default:
                qa.f fVar = (qa.f) this.f3861b;
                fVar.d();
                fVar.e(true);
                byte[] bArr = fVar.f20125f;
                int i10 = fVar.f20126g;
                int i11 = i10 + 1;
                fVar.f20126g = i11;
                bArr[i10] = (byte) i3;
                fVar.f20127h = true;
                long j = fVar.f20124e + i11;
                if (j > fVar.f20122c) {
                    fVar.f20122c = j;
                    return;
                }
                return;
        }
    }
}
