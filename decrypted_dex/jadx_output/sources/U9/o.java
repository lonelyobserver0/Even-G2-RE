package U9;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f7560a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7561b;

    public o(String str, List list) {
        this.f7560a = str;
        this.f7561b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            bArr[i3] = (byte) ((Integer) list.get(i3)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = this.f7560a;
        if (str != null) {
            if (!str.equals(oVar.f7560a)) {
                return false;
            }
        } else if (oVar.f7560a != null) {
            return false;
        }
        List list = this.f7561b;
        if (list.size() != oVar.f7561b.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            boolean z2 = list.get(i3) instanceof byte[];
            List list2 = oVar.f7561b;
            if (z2 && (list2.get(i3) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                    return false;
                }
            } else if (!list.get(i3).equals(list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f7560a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7560a);
        List list = this.f7561b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = StubApp.getString2(397) + list;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
