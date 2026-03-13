package D5;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.mapbox.common.movement.GoogleActivityRecognition;
import com.stub.StubApp;

/* renamed from: D5.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0051o implements q4.i, ObjectConstructor, q4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1442b;

    public /* synthetic */ C0051o(String str, int i3) {
        this.f1441a = i3;
        this.f1442b = str;
    }

    @Override // q4.e
    public void C(Exception exc) {
        GoogleActivityRecognition.Companion.withLogs$lambda$7(this.f1442b, exc);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newUnsafeAllocator$20;
        Object lambda$newDefaultConstructor$7;
        Object lambda$newDefaultConstructor$8;
        Object lambda$get$2;
        Object lambda$get$3;
        Object lambda$get$4;
        switch (this.f1441a) {
            case 2:
                lambda$newUnsafeAllocator$20 = ConstructorConstructor.lambda$newUnsafeAllocator$20(this.f1442b);
                return lambda$newUnsafeAllocator$20;
            case 3:
                lambda$newDefaultConstructor$7 = ConstructorConstructor.lambda$newDefaultConstructor$7(this.f1442b);
                return lambda$newDefaultConstructor$7;
            case 4:
                lambda$newDefaultConstructor$8 = ConstructorConstructor.lambda$newDefaultConstructor$8(this.f1442b);
                return lambda$newDefaultConstructor$8;
            case 5:
                lambda$get$2 = ConstructorConstructor.lambda$get$2(this.f1442b);
                return lambda$get$2;
            case 6:
                lambda$get$3 = ConstructorConstructor.lambda$get$3(this.f1442b);
                return lambda$get$3;
            default:
                lambda$get$4 = ConstructorConstructor.lambda$get$4(this.f1442b);
                return lambda$get$4;
        }
    }

    @Override // q4.i
    public q4.j k(Object obj) {
        String str = this.f1442b;
        I i3 = (I) obj;
        switch (this.f1441a) {
            case 0:
                F5.c cVar = FirebaseMessaging.f12055l;
                i3.getClass();
                q4.s d8 = i3.d(new F(StubApp.getString2(1384), str));
                i3.f();
                return d8;
            default:
                F5.c cVar2 = FirebaseMessaging.f12055l;
                i3.getClass();
                q4.s d10 = i3.d(new F(StubApp.getString2(1383), str));
                i3.f();
                return d10;
        }
    }
}
