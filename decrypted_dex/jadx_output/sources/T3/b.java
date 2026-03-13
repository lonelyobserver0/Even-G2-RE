package T3;

import android.os.Parcel;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends RuntimeException {
    public b(String str, Parcel parcel) {
        super(str + StubApp.getString2(6151) + parcel.dataPosition() + StubApp.getString2(6152) + parcel.dataSize());
    }
}
