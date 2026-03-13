package n7;

import X6.s;
import android.content.res.TypedArray;
import android.graphics.Color;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1391a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TypedArray f17851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f17852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391a(TypedArray typedArray, float f10, boolean z2) {
        super(1);
        this.f17851a = typedArray;
        this.f17852b = f10;
        this.f17853c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1392b LocationComponentSettings = (C1392b) obj;
        Intrinsics.checkNotNullParameter(LocationComponentSettings, "$this$LocationComponentSettings");
        TypedArray typedArray = this.f17851a;
        LocationComponentSettings.f17855b = typedArray.getBoolean(51, false);
        LocationComponentSettings.f17856c = typedArray.getBoolean(93, false);
        LocationComponentSettings.f17857d = typedArray.getColor(92, Color.parseColor(StubApp.getString2(21444)));
        LocationComponentSettings.f17858e = typedArray.getDimension(94, this.f17852b * 10.0f);
        LocationComponentSettings.f17859f = typedArray.getBoolean(95, false);
        String string2 = StubApp.getString2(21445);
        LocationComponentSettings.f17860g = typedArray.getColor(50, Color.parseColor(string2));
        LocationComponentSettings.f17861h = typedArray.getColor(49, Color.parseColor(string2));
        LocationComponentSettings.f17862i = typedArray.getString(52);
        LocationComponentSettings.j = typedArray.getString(53);
        LocationComponentSettings.f17863k = this.f17853c;
        s sVar = s.values()[typedArray.getInt(90, 0)];
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        LocationComponentSettings.f17864l = sVar;
        LocationComponentSettings.f17865m = typedArray.getString(96);
        return Unit.INSTANCE;
    }
}
