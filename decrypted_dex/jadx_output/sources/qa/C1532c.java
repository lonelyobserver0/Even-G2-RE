package qa;

import android.util.Log;
import com.stub.StubApp;
import java.io.InputStream;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qa.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1532c extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1533d f20110a;

    /* renamed from: b, reason: collision with root package name */
    public long f20111b = 0;

    public C1532c(InterfaceC1533d interfaceC1533d) {
        this.f20110a = interfaceC1533d;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f20111b;
        InterfaceC1533d interfaceC1533d = this.f20110a;
        interfaceC1533d.seek(j);
        long length = interfaceC1533d.length() - interfaceC1533d.getPosition();
        return length > 2147483647L ? IntCompanionObject.MAX_VALUE : (int) length;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f20111b;
        InterfaceC1533d interfaceC1533d = this.f20110a;
        interfaceC1533d.seek(j);
        if (interfaceC1533d.c()) {
            return -1;
        }
        int read = interfaceC1533d.read();
        if (read != -1) {
            this.f20111b++;
            return read;
        }
        Log.e(StubApp.getString2(948), StubApp.getString2(22329) + this.f20111b + StubApp.getString2(22330) + interfaceC1533d.getPosition());
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j3 = this.f20111b;
        InterfaceC1533d interfaceC1533d = this.f20110a;
        interfaceC1533d.seek(j3);
        interfaceC1533d.seek(this.f20111b + j);
        this.f20111b += j;
        return j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        long j = this.f20111b;
        InterfaceC1533d interfaceC1533d = this.f20110a;
        interfaceC1533d.seek(j);
        if (interfaceC1533d.c()) {
            return -1;
        }
        int read = interfaceC1533d.read(bArr, i3, i10);
        if (read != -1) {
            this.f20111b += read;
            return read;
        }
        Log.e(StubApp.getString2(948), StubApp.getString2(22329) + this.f20111b + StubApp.getString2(22330) + interfaceC1533d.getPosition());
        return read;
    }
}
