package r7;

import android.util.Pair;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import org.bouncycastle.asn1.x509.DisplayText;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1577c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20374a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f20375b;

    static {
        Pair pair = new Pair(1, 2);
        Pair pair2 = new Pair(2, 2);
        Pair pair3 = new Pair(4, 2);
        Pair pair4 = new Pair(10, 2);
        Pair pair5 = new Pair(20, 2);
        Pair pair6 = new Pair(50, 2);
        Pair pair7 = new Pair(75, 3);
        Pair pair8 = new Pair(100, 2);
        Pair pair9 = new Pair(150, 2);
        Integer valueOf = Integer.valueOf(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        f20374a = CollectionsKt.listOf((Object[]) new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(valueOf, 2), new Pair(300, 3), new Pair(500, 2), new Pair(1000, 2), new Pair(1500, 2), new Pair(3000, 3), new Pair(5000, 2), new Pair(10000, 2), new Pair(20000, 2), new Pair(30000, 3), new Pair(50000, 2), new Pair(100000, 2), new Pair(200000, 2), new Pair(300000, 3), new Pair(400000, 2), new Pair(500000, 2), new Pair(600000, 3), new Pair(800000, 2), new Pair(Integer.valueOf(DurationKt.NANOS_IN_MILLIS), 2), new Pair(2000000, 2), new Pair(3000000, 3), new Pair(4000000, 2), new Pair(5000000, 2), new Pair(6000000, 3), new Pair(8000000, 2), new Pair(10000000, 2), new Pair(12000000, 2), new Pair(15000000, 2)});
        f20375b = CollectionsKt.listOf((Object[]) new Pair[]{new Pair(1, 1), new Pair(4, 2), new Pair(6, 2), new Pair(10, 2), new Pair(20, 2), new Pair(30, 2), new Pair(50, 2), new Pair(75, 3), new Pair(100, 2), new Pair(valueOf, 2), new Pair(300, 3), new Pair(400, 2), new Pair(600, 3), new Pair(800, 2), new Pair(1000, 2), new Pair(1320, 2), new Pair(2640, 2), new Pair(5280, 2), new Pair(10560, 2), new Pair(15840, 3), new Pair(21120, 2), new Pair(42240, 2), new Pair(63360, 2), new Pair(79200, 3), new Pair(105600, 2), new Pair(158400, 3), new Pair(211200, 2), new Pair(422400, 2), new Pair(633600, 2), new Pair(1056000, 2), new Pair(1584000, 3), new Pair(2112000, 2), new Pair(3168000, 3), new Pair(5280000, 2), new Pair(7920000, 3), new Pair(10560000, 2), new Pair(15840000, 2), new Pair(21120000, 2), new Pair(26400000, 2), new Pair(31680000, 3), new Pair(42240000, 2), new Pair(52800000, 2)});
    }
}
