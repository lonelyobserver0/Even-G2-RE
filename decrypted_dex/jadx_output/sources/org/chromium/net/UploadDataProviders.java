package org.chromium.net;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.measurement.L1;
import java.io.File;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new Nc.c(new F5.c(file, 13));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new Nc.c(new A0.c(parcelFileDescriptor));
    }

    public static UploadDataProvider create(byte[] bArr, int i3, int i10) {
        return L1.l(i3, i10, bArr);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new Nc.a(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return L1.l(0, bArr.length, bArr);
    }
}
