package H1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f2691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2692b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2693c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2694d;

    public h(int i3, int i10, long j, long j3) {
        this.f2691a = i3;
        this.f2692b = i10;
        this.f2693c = j;
        this.f2694d = j3;
    }

    public static h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2691a);
            dataOutputStream.writeInt(this.f2692b);
            dataOutputStream.writeLong(this.f2693c);
            dataOutputStream.writeLong(this.f2694d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f2692b == hVar.f2692b && this.f2693c == hVar.f2693c && this.f2691a == hVar.f2691a && this.f2694d == hVar.f2694d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2692b), Long.valueOf(this.f2693c), Integer.valueOf(this.f2691a), Long.valueOf(this.f2694d));
    }
}
