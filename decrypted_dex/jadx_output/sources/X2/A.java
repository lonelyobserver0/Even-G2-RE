package X2;

import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ A f8253a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f8254b = LazyKt.lazy(new J2.b(5));

    public static MessageCodec a() {
        return (MessageCodec) f8254b.getValue();
    }

    public static void b(A a3, BinaryMessenger binaryMessenger, final v vVar) {
        a3.getClass();
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", StubApp.getString2(7040));
        String concat = "".length() > 0 ? StubApp.getString2(1).concat("") : "";
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7041), concat), a());
        if (vVar != null) {
            final int i3 = 10;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                /* JADX WARN: Code restructure failed: missing block: B:320:0x0a46, code lost:
                
                    if (r9.checkSelfPermission(com.stub.StubApp.getString2("1283")) == 0) goto L293;
                 */
                /* JADX WARN: Removed duplicated region for block: B:149:0x0558  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x055d  */
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onMessage(java.lang.Object r19, io.flutter.plugin.common.BasicMessageChannel.Reply r20) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7042), concat), a());
        if (vVar != null) {
            final int i10 = 2;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7043), concat), a());
        if (vVar != null) {
            final int i11 = 3;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7044), concat), a());
        if (vVar != null) {
            final int i12 = 4;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7045), concat), a());
        if (vVar != null) {
            final int i13 = 5;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7046), concat), a());
        if (vVar != null) {
            final int i14 = 6;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7047), concat), a());
        if (vVar != null) {
            final int i15 = 7;
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7048), concat), a());
        if (vVar != null) {
            final int i16 = 8;
            basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7049), concat), a());
        if (vVar != null) {
            final int i17 = 9;
            basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel9.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7050), concat), a());
        if (vVar != null) {
            final int i18 = 11;
            basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel10.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7051), concat), a());
        if (vVar != null) {
            final int i19 = 12;
            basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel11.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7052), concat), a());
        if (vVar != null) {
            final int i20 = 13;
            basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel12.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7053), concat), a());
        if (vVar != null) {
            final int i21 = 14;
            basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel13.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7054), concat), a());
        if (vVar != null) {
            final int i22 = 15;
            basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel14.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7055), concat), a());
        if (vVar != null) {
            final int i23 = 16;
            basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel15.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7056), concat), a());
        if (vVar != null) {
            final int i24 = 17;
            basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel16.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7057), concat), a());
        if (vVar != null) {
            final int i25 = 18;
            basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel17.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7058), concat), a());
        if (vVar != null) {
            final int i26 = 19;
            basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel18.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7059), concat), a());
        if (vVar != null) {
            final int i27 = 0;
            basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel19.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7060), concat), a());
        if (vVar == null) {
            basicMessageChannel20.setMessageHandler(null);
        } else {
            final int i28 = 1;
            basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: X2.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 2788
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X2.y.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        }
    }
}
