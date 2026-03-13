package L6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "CanonicalTileID", imports = {}))
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"LL6/e;", "", "", "a", "J", "getZoom", "()J", "zoom", "b", "getX", "x", "c", "getY", "y", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("z")
    private final long zoom;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("x")
    private final long x;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("y")
    private final long y;

    public e(long j, long j3, long j10) {
        this.zoom = j;
        this.x = j3;
        this.y = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.zoom == eVar.zoom && this.x == eVar.x && this.y == eVar.y;
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + com.mapbox.common.b.b(Long.hashCode(this.zoom) * 31, 31, this.x);
    }

    public final String toString() {
        return StubApp.getString2(3421) + this.zoom + StubApp.getString2(3422) + this.x + StubApp.getString2(3423) + this.y + ')';
    }
}
