package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0616g implements InterfaceC0651n {

    /* renamed from: a, reason: collision with root package name */
    public final Double f11566a;

    public C0616g(Double d8) {
        if (d8 == null) {
            this.f11566a = Double.valueOf(Double.NaN);
        } else {
            this.f11566a = d8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        Double d8 = this.f11566a;
        boolean z2 = false;
        if (!Double.isNaN(d8.doubleValue()) && d8.doubleValue() != 0.0d) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        Double d8 = this.f11566a;
        if (Double.isNaN(d8.doubleValue())) {
            return StubApp.getString2(10402);
        }
        if (Double.isInfinite(d8.doubleValue())) {
            return d8.doubleValue() > 0.0d ? StubApp.getString2(10404) : StubApp.getString2(10403);
        }
        BigDecimal valueOf = BigDecimal.valueOf(d8.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat(StubApp.getString2(12067));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        String string2 = StubApp.getString2(4909);
        int indexOf = format.indexOf(string2);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace(StubApp.getString2(7694), StubApp.getString2(12068)).replace(string2, StubApp.getString2(12069)) : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        return this.f11566a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0616g) {
            return this.f11566a.equals(((C0616g) obj).f11566a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11566a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        if (StubApp.getString2(11908).equals(str)) {
            return new C0666q(b());
        }
        throw new IllegalArgumentException(b() + StubApp.getString2(1) + str + StubApp.getString2(12027));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        return new C0616g(this.f11566a);
    }

    public final String toString() {
        return b();
    }
}
