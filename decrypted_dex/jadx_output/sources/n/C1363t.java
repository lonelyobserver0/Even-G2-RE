package n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: n.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1363t {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f17604a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f17605b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17606c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17607d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17608e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f17609f;

    public /* synthetic */ C1363t(TextView textView) {
        this.f17609f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f17609f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f17606c || this.f17607d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f17606c) {
                    mutate.setTintList(this.f17604a);
                }
                if (this.f17607d) {
                    mutate.setTintMode(this.f17605b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C1361s c1361s = (C1361s) this.f17609f;
        Drawable checkMarkDrawable = c1361s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f17606c || this.f17607d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f17606c) {
                    mutate.setTintList(this.f17604a);
                }
                if (this.f17607d) {
                    mutate.setTintMode(this.f17605b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c1361s.getDrawableState());
                }
                c1361s.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.TextView r0 = r8.f17609f
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = h.AbstractC0997a.f14405m
            a5.c r7 = a5.c.E(r0, r9, r3, r10)
            java.lang.Object r0 = r7.f9283c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.f9283c
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            N.I.h(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r10 == 0) goto L3e
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L3e
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r9 = com.google.android.gms.internal.measurement.D1.m(r10, r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3b:
            r0 = move-exception
            r9 = r0
            goto L7b
        L3e:
            boolean r9 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            int r9 = r0.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b
            android.graphics.drawable.Drawable r9 = com.google.android.gms.internal.measurement.D1.m(r10, r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b
        L55:
            r9 = 2
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            android.content.res.ColorStateList r9 = r7.p(r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3b
        L63:
            r9 = 3
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L77
            r10 = -1
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = n.AbstractC1346k0.c(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3b
        L77:
            r7.I()
            return
        L7b:
            r7.I()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1363t.c(android.util.AttributeSet, int):void");
    }
}
