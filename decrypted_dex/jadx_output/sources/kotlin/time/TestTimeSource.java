package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "reading", "", "read", "plusAssign", "", "duration", "Lkotlin/time/Duration;", "plusAssign-LRDsOJo", "(J)V", "overflow", "overflow-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,210:1\n80#2:211\n80#2:212\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n184#1:211\n191#1:212\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m1476overflowLRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m1408toStringimpl(duration)) + '.');
    }

    /* renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m1477plusAssignLRDsOJo(long duration) {
        long m1407toLongimpl = Duration.m1407toLongimpl(duration, getUnit());
        if (((m1407toLongimpl - 1) | 1) != LongCompanionObject.MAX_VALUE) {
            long j = this.reading;
            long j3 = j + m1407toLongimpl;
            if ((m1407toLongimpl ^ j) >= 0 && (j ^ j3) < 0) {
                m1476overflowLRDsOJo(duration);
            }
            this.reading = j3;
            return;
        }
        long m1371divUwyO8pc = Duration.m1371divUwyO8pc(duration, 2);
        if ((1 | (Duration.m1407toLongimpl(m1371divUwyO8pc, getUnit()) - 1)) == LongCompanionObject.MAX_VALUE) {
            m1476overflowLRDsOJo(duration);
            return;
        }
        long j10 = this.reading;
        try {
            m1477plusAssignLRDsOJo(m1371divUwyO8pc);
            m1477plusAssignLRDsOJo(Duration.m1396minusLRDsOJo(duration, m1371divUwyO8pc));
        } catch (IllegalStateException e10) {
            this.reading = j10;
            throw e10;
        }
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: read, reason: from getter */
    public long getReading() {
        return this.reading;
    }
}
