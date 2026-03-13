package pb;

import android.util.LongSparseArray;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface e {
    static void a(BinaryMessenger binaryMessenger, final v vVar) {
        g gVar = g.f19780a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", gVar);
        if (vVar != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    LongSparseArray longSparseArray;
                    switch (i3) {
                        case 0:
                            v vVar2 = vVar;
                            ArrayList arrayList = new ArrayList();
                            int i10 = 0;
                            while (true) {
                                try {
                                    longSparseArray = vVar2.f19804a;
                                } catch (Throwable th) {
                                    arrayList = W.a.A(th);
                                }
                                if (i10 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    reply.reply(arrayList);
                                    break;
                                } else {
                                    ((r) longSparseArray.valueAt(i10)).c();
                                    i10++;
                                }
                            }
                        case 1:
                            v vVar3 = vVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, vVar3.b((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            v vVar4 = vVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, vVar4.c((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            v vVar5 = vVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                vVar5.d((Long) ((ArrayList) obj).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            v vVar6 = vVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                vVar6.f19806c.f6177b = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        default:
                            v vVar7 = vVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, vVar7.e((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView", gVar);
        if (vVar != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    LongSparseArray longSparseArray;
                    switch (i10) {
                        case 0:
                            v vVar2 = vVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = vVar2.f19804a;
                                } catch (Throwable th) {
                                    arrayList = W.a.A(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    reply.reply(arrayList);
                                    break;
                                } else {
                                    ((r) longSparseArray.valueAt(i102)).c();
                                    i102++;
                                }
                            }
                        case 1:
                            v vVar3 = vVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, vVar3.b((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            v vVar4 = vVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, vVar4.c((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            v vVar5 = vVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                vVar5.d((Long) ((ArrayList) obj).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            v vVar6 = vVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                vVar6.f19806c.f6177b = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        default:
                            v vVar7 = vVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, vVar7.e((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView", gVar);
        if (vVar != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    LongSparseArray longSparseArray;
                    switch (i11) {
                        case 0:
                            v vVar2 = vVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = vVar2.f19804a;
                                } catch (Throwable th) {
                                    arrayList = W.a.A(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    reply.reply(arrayList);
                                    break;
                                } else {
                                    ((r) longSparseArray.valueAt(i102)).c();
                                    i102++;
                                }
                            }
                        case 1:
                            v vVar3 = vVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, vVar3.b((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            v vVar4 = vVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, vVar4.c((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            v vVar5 = vVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                vVar5.d((Long) ((ArrayList) obj).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            v vVar6 = vVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                vVar6.f19806c.f6177b = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        default:
                            v vVar7 = vVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, vVar7.e((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", gVar);
        if (vVar != null) {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    LongSparseArray longSparseArray;
                    switch (i12) {
                        case 0:
                            v vVar2 = vVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = vVar2.f19804a;
                                } catch (Throwable th) {
                                    arrayList = W.a.A(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    reply.reply(arrayList);
                                    break;
                                } else {
                                    ((r) longSparseArray.valueAt(i102)).c();
                                    i102++;
                                }
                            }
                        case 1:
                            v vVar3 = vVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, vVar3.b((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            v vVar4 = vVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, vVar4.c((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            v vVar5 = vVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                vVar5.d((Long) ((ArrayList) obj).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            v vVar6 = vVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                vVar6.f19806c.f6177b = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        default:
                            v vVar7 = vVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, vVar7.e((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", gVar);
        if (vVar != null) {
            final int i13 = 4;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    LongSparseArray longSparseArray;
                    switch (i13) {
                        case 0:
                            v vVar2 = vVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = vVar2.f19804a;
                                } catch (Throwable th) {
                                    arrayList = W.a.A(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    reply.reply(arrayList);
                                    break;
                                } else {
                                    ((r) longSparseArray.valueAt(i102)).c();
                                    i102++;
                                }
                            }
                        case 1:
                            v vVar3 = vVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, vVar3.b((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            v vVar4 = vVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, vVar4.c((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            v vVar5 = vVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                vVar5.d((Long) ((ArrayList) obj).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            v vVar6 = vVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                vVar6.f19806c.f6177b = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        default:
                            v vVar7 = vVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, vVar7.e((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset", gVar);
        if (vVar == null) {
            basicMessageChannel6.setMessageHandler(null);
        } else {
            final int i14 = 5;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    LongSparseArray longSparseArray;
                    switch (i14) {
                        case 0:
                            v vVar2 = vVar;
                            ArrayList arrayList = new ArrayList();
                            int i102 = 0;
                            while (true) {
                                try {
                                    longSparseArray = vVar2.f19804a;
                                } catch (Throwable th) {
                                    arrayList = W.a.A(th);
                                }
                                if (i102 >= longSparseArray.size()) {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    reply.reply(arrayList);
                                    break;
                                } else {
                                    ((r) longSparseArray.valueAt(i102)).c();
                                    i102++;
                                }
                            }
                        case 1:
                            v vVar3 = vVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                arrayList2.add(0, vVar3.b((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            v vVar4 = vVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                arrayList3.add(0, vVar4.c((f) ((ArrayList) obj).get(0)));
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            v vVar5 = vVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                vVar5.d((Long) ((ArrayList) obj).get(0));
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            v vVar6 = vVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                vVar6.f19806c.f6177b = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        default:
                            v vVar7 = vVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, vVar7.e((String) arrayList7.get(0), (String) arrayList7.get(1)));
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                    }
                }
            });
        }
    }
}
