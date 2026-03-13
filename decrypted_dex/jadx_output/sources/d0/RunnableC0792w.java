package d0;

import N.ViewTreeObserverOnPreDrawListenerC0169o;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: d0.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC0792w extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f13396a;

    /* renamed from: b, reason: collision with root package name */
    public final View f13397b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13398c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13399d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13400e;

    public RunnableC0792w(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f13400e = true;
        this.f13396a = viewGroup;
        this.f13397b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f13400e = true;
        if (this.f13398c) {
            return !this.f13399d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f13398c = true;
            ViewTreeObserverOnPreDrawListenerC0169o.a(this.f13396a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f13398c;
        ViewGroup viewGroup = this.f13396a;
        if (z2 || !this.f13400e) {
            viewGroup.endViewTransition(this.f13397b);
            this.f13399d = true;
        } else {
            this.f13400e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f10) {
        this.f13400e = true;
        if (this.f13398c) {
            return !this.f13399d;
        }
        if (!super.getTransformation(j, transformation, f10)) {
            this.f13398c = true;
            ViewTreeObserverOnPreDrawListenerC0169o.a(this.f13396a, this);
        }
        return true;
    }
}
