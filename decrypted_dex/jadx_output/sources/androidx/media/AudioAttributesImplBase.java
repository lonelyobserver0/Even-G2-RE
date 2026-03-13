package androidx.media;

import i2.u;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f9955a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9956b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9957c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9958d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f9956b != audioAttributesImplBase.f9956b) {
            return false;
        }
        int i3 = this.f9957c;
        int i10 = audioAttributesImplBase.f9957c;
        int i11 = audioAttributesImplBase.f9958d;
        if (i11 == -1) {
            i11 = AudioAttributesCompat.b(i10, audioAttributesImplBase.f9955a);
        }
        if (i11 == 6) {
            i10 |= 4;
        } else if (i11 == 7) {
            i10 |= 1;
        }
        return i3 == (i10 & 273) && this.f9955a == audioAttributesImplBase.f9955a && this.f9958d == audioAttributesImplBase.f9958d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9956b), Integer.valueOf(this.f9957c), Integer.valueOf(this.f9955a), Integer.valueOf(this.f9958d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f9958d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f9958d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i3 = this.f9955a;
        int i10 = AudioAttributesCompat.f9951b;
        switch (i3) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = u.p(i3, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f9956b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f9957c).toUpperCase());
        return sb2.toString();
    }
}
