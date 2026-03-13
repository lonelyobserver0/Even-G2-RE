package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u000f"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "minus", "minus-LRDsOJo", "hasPassedNow", "", "hasNotPassedNow", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface TimeMark {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(TimeMark timeMark) {
            return Duration.m1394isNegativeimpl(timeMark.mo1358elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(TimeMark timeMark) {
            return !Duration.m1394isNegativeimpl(timeMark.mo1358elapsedNowUwyO8pc());
        }

        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1478minusLRDsOJo(TimeMark timeMark, long j) {
            return timeMark.mo1361plusLRDsOJo(Duration.m1412unaryMinusUwyO8pc(j));
        }

        /* renamed from: plus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1479plusLRDsOJo(TimeMark timeMark, long j) {
            return new AdjustedTimeMark(timeMark, j, null);
        }
    }

    /* renamed from: elapsedNow-UwyO8pc */
    long mo1358elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* renamed from: minus-LRDsOJo */
    TimeMark mo1359minusLRDsOJo(long duration);

    /* renamed from: plus-LRDsOJo */
    TimeMark mo1361plusLRDsOJo(long duration);
}
