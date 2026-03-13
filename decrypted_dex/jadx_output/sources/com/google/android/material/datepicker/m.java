package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new l(0);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f11935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11936b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11937c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11938d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11939e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11940f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11941g;

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar x7 = hc.b.x(calendar);
        this.f11935a = x7;
        this.f11937c = x7.get(2);
        this.f11938d = x7.get(1);
        this.f11939e = x7.getMaximum(7);
        this.f11940f = x7.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(12499), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
        this.f11936b = simpleDateFormat.format(x7.getTime());
        this.f11941g = x7.getTimeInMillis();
    }

    public static m d(int i3, int i10) {
        Calendar I10 = hc.b.I(null);
        I10.set(1, i3);
        I10.set(2, i10);
        return new m(I10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11935a.compareTo(((m) obj).f11935a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        Calendar calendar = this.f11935a;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f11939e : firstDayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f11937c == mVar.f11937c && this.f11938d == mVar.f11938d;
    }

    public final int f(m mVar) {
        if (!(this.f11935a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException(StubApp.getString2(12516));
        }
        return (mVar.f11937c - this.f11937c) + ((mVar.f11938d - this.f11938d) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11937c), Integer.valueOf(this.f11938d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f11938d);
        parcel.writeInt(this.f11937c);
    }
}
