package pb;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import v0.C1830z;
import v0.InterfaceC1820o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface m {
    static void a(BinaryMessenger binaryMessenger, String str, final r rVar) {
        String concat = str.isEmpty() ? "" : ".".concat(str);
        String j = E1.a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping", concat);
        g gVar = g.f19780a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, j, gVar);
        if (rVar != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i3) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                rVar2.d((Boolean) ((ArrayList) obj).get(0));
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = W.a.A(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                rVar3.f((Double) ((ArrayList) obj).get(0));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.e((Double) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                Mb.b bVar = (Mb.b) rVar5.f19800d;
                                bVar.getClass();
                                C1830z c1830z = (C1830z) bVar;
                                c1830z.L();
                                c1830z.L();
                                int d8 = c1830z.f21816B.d(c1830z.f21861v0.f21662e, true);
                                c1830z.I(d8, d8 == -1 ? 2 : 1, true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                Mb.b bVar2 = (Mb.b) rVar6.f19800d;
                                bVar2.getClass();
                                C1830z c1830z2 = (C1830z) bVar2;
                                c1830z2.L();
                                c1830z2.L();
                                int d10 = c1830z2.f21816B.d(c1830z2.f21861v0.f21662e, false);
                                c1830z2.I(d10, d10 == -1 ? 2 : 1, false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar7.getClass();
                                long longValue = l9.longValue();
                                Mb.b bVar3 = (Mb.b) rVar7.f19800d;
                                bVar3.getClass();
                                bVar3.j(((C1830z) bVar3).q(), longValue);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            r rVar8 = rVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC1820o interfaceC1820o = rVar8.f19800d;
                                Long valueOf = Long.valueOf(((C1830z) interfaceC1820o).r());
                                Long valueOf2 = Long.valueOf(((C1830z) interfaceC1820o).m());
                                j jVar = new j();
                                jVar.f19784a = valueOf;
                                jVar.f19785b = valueOf2;
                                arrayList7.add(0, jVar);
                            } catch (Throwable th7) {
                                arrayList7 = W.a.A(th7);
                            }
                            reply.reply(arrayList7);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, E1.a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume", concat), gVar);
        if (rVar != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i10) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                rVar2.d((Boolean) ((ArrayList) obj).get(0));
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = W.a.A(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                rVar3.f((Double) ((ArrayList) obj).get(0));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.e((Double) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                Mb.b bVar = (Mb.b) rVar5.f19800d;
                                bVar.getClass();
                                C1830z c1830z = (C1830z) bVar;
                                c1830z.L();
                                c1830z.L();
                                int d8 = c1830z.f21816B.d(c1830z.f21861v0.f21662e, true);
                                c1830z.I(d8, d8 == -1 ? 2 : 1, true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                Mb.b bVar2 = (Mb.b) rVar6.f19800d;
                                bVar2.getClass();
                                C1830z c1830z2 = (C1830z) bVar2;
                                c1830z2.L();
                                c1830z2.L();
                                int d10 = c1830z2.f21816B.d(c1830z2.f21861v0.f21662e, false);
                                c1830z2.I(d10, d10 == -1 ? 2 : 1, false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar7.getClass();
                                long longValue = l9.longValue();
                                Mb.b bVar3 = (Mb.b) rVar7.f19800d;
                                bVar3.getClass();
                                bVar3.j(((C1830z) bVar3).q(), longValue);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            r rVar8 = rVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC1820o interfaceC1820o = rVar8.f19800d;
                                Long valueOf = Long.valueOf(((C1830z) interfaceC1820o).r());
                                Long valueOf2 = Long.valueOf(((C1830z) interfaceC1820o).m());
                                j jVar = new j();
                                jVar.f19784a = valueOf;
                                jVar.f19785b = valueOf2;
                                arrayList7.add(0, jVar);
                            } catch (Throwable th7) {
                                arrayList7 = W.a.A(th7);
                            }
                            reply.reply(arrayList7);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, E1.a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed", concat), gVar);
        if (rVar != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i11) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                rVar2.d((Boolean) ((ArrayList) obj).get(0));
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = W.a.A(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                rVar3.f((Double) ((ArrayList) obj).get(0));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.e((Double) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                Mb.b bVar = (Mb.b) rVar5.f19800d;
                                bVar.getClass();
                                C1830z c1830z = (C1830z) bVar;
                                c1830z.L();
                                c1830z.L();
                                int d8 = c1830z.f21816B.d(c1830z.f21861v0.f21662e, true);
                                c1830z.I(d8, d8 == -1 ? 2 : 1, true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                Mb.b bVar2 = (Mb.b) rVar6.f19800d;
                                bVar2.getClass();
                                C1830z c1830z2 = (C1830z) bVar2;
                                c1830z2.L();
                                c1830z2.L();
                                int d10 = c1830z2.f21816B.d(c1830z2.f21861v0.f21662e, false);
                                c1830z2.I(d10, d10 == -1 ? 2 : 1, false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar7.getClass();
                                long longValue = l9.longValue();
                                Mb.b bVar3 = (Mb.b) rVar7.f19800d;
                                bVar3.getClass();
                                bVar3.j(((C1830z) bVar3).q(), longValue);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            r rVar8 = rVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC1820o interfaceC1820o = rVar8.f19800d;
                                Long valueOf = Long.valueOf(((C1830z) interfaceC1820o).r());
                                Long valueOf2 = Long.valueOf(((C1830z) interfaceC1820o).m());
                                j jVar = new j();
                                jVar.f19784a = valueOf;
                                jVar.f19785b = valueOf2;
                                arrayList7.add(0, jVar);
                            } catch (Throwable th7) {
                                arrayList7 = W.a.A(th7);
                            }
                            reply.reply(arrayList7);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, E1.a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play", concat), gVar);
        if (rVar != null) {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i12) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                rVar2.d((Boolean) ((ArrayList) obj).get(0));
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = W.a.A(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                rVar3.f((Double) ((ArrayList) obj).get(0));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.e((Double) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                Mb.b bVar = (Mb.b) rVar5.f19800d;
                                bVar.getClass();
                                C1830z c1830z = (C1830z) bVar;
                                c1830z.L();
                                c1830z.L();
                                int d8 = c1830z.f21816B.d(c1830z.f21861v0.f21662e, true);
                                c1830z.I(d8, d8 == -1 ? 2 : 1, true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                Mb.b bVar2 = (Mb.b) rVar6.f19800d;
                                bVar2.getClass();
                                C1830z c1830z2 = (C1830z) bVar2;
                                c1830z2.L();
                                c1830z2.L();
                                int d10 = c1830z2.f21816B.d(c1830z2.f21861v0.f21662e, false);
                                c1830z2.I(d10, d10 == -1 ? 2 : 1, false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar7.getClass();
                                long longValue = l9.longValue();
                                Mb.b bVar3 = (Mb.b) rVar7.f19800d;
                                bVar3.getClass();
                                bVar3.j(((C1830z) bVar3).q(), longValue);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            r rVar8 = rVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC1820o interfaceC1820o = rVar8.f19800d;
                                Long valueOf = Long.valueOf(((C1830z) interfaceC1820o).r());
                                Long valueOf2 = Long.valueOf(((C1830z) interfaceC1820o).m());
                                j jVar = new j();
                                jVar.f19784a = valueOf;
                                jVar.f19785b = valueOf2;
                                arrayList7.add(0, jVar);
                            } catch (Throwable th7) {
                                arrayList7 = W.a.A(th7);
                            }
                            reply.reply(arrayList7);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, E1.a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause", concat), gVar);
        if (rVar != null) {
            final int i13 = 4;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i13) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                rVar2.d((Boolean) ((ArrayList) obj).get(0));
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = W.a.A(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                rVar3.f((Double) ((ArrayList) obj).get(0));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.e((Double) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                Mb.b bVar = (Mb.b) rVar5.f19800d;
                                bVar.getClass();
                                C1830z c1830z = (C1830z) bVar;
                                c1830z.L();
                                c1830z.L();
                                int d8 = c1830z.f21816B.d(c1830z.f21861v0.f21662e, true);
                                c1830z.I(d8, d8 == -1 ? 2 : 1, true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                Mb.b bVar2 = (Mb.b) rVar6.f19800d;
                                bVar2.getClass();
                                C1830z c1830z2 = (C1830z) bVar2;
                                c1830z2.L();
                                c1830z2.L();
                                int d10 = c1830z2.f21816B.d(c1830z2.f21861v0.f21662e, false);
                                c1830z2.I(d10, d10 == -1 ? 2 : 1, false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar7.getClass();
                                long longValue = l9.longValue();
                                Mb.b bVar3 = (Mb.b) rVar7.f19800d;
                                bVar3.getClass();
                                bVar3.j(((C1830z) bVar3).q(), longValue);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            r rVar8 = rVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC1820o interfaceC1820o = rVar8.f19800d;
                                Long valueOf = Long.valueOf(((C1830z) interfaceC1820o).r());
                                Long valueOf2 = Long.valueOf(((C1830z) interfaceC1820o).m());
                                j jVar = new j();
                                jVar.f19784a = valueOf;
                                jVar.f19785b = valueOf2;
                                arrayList7.add(0, jVar);
                            } catch (Throwable th7) {
                                arrayList7 = W.a.A(th7);
                            }
                            reply.reply(arrayList7);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, E1.a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo", concat), gVar);
        if (rVar != null) {
            final int i14 = 5;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i14) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                rVar2.d((Boolean) ((ArrayList) obj).get(0));
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = W.a.A(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                rVar3.f((Double) ((ArrayList) obj).get(0));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.e((Double) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                Mb.b bVar = (Mb.b) rVar5.f19800d;
                                bVar.getClass();
                                C1830z c1830z = (C1830z) bVar;
                                c1830z.L();
                                c1830z.L();
                                int d8 = c1830z.f21816B.d(c1830z.f21861v0.f21662e, true);
                                c1830z.I(d8, d8 == -1 ? 2 : 1, true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                Mb.b bVar2 = (Mb.b) rVar6.f19800d;
                                bVar2.getClass();
                                C1830z c1830z2 = (C1830z) bVar2;
                                c1830z2.L();
                                c1830z2.L();
                                int d10 = c1830z2.f21816B.d(c1830z2.f21861v0.f21662e, false);
                                c1830z2.I(d10, d10 == -1 ? 2 : 1, false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar7.getClass();
                                long longValue = l9.longValue();
                                Mb.b bVar3 = (Mb.b) rVar7.f19800d;
                                bVar3.getClass();
                                bVar3.j(((C1830z) bVar3).q(), longValue);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            r rVar8 = rVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC1820o interfaceC1820o = rVar8.f19800d;
                                Long valueOf = Long.valueOf(((C1830z) interfaceC1820o).r());
                                Long valueOf2 = Long.valueOf(((C1830z) interfaceC1820o).m());
                                j jVar = new j();
                                jVar.f19784a = valueOf;
                                jVar.f19785b = valueOf2;
                                arrayList7.add(0, jVar);
                            } catch (Throwable th7) {
                                arrayList7 = W.a.A(th7);
                            }
                            reply.reply(arrayList7);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, E1.a.j("dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getPlaybackState", concat), gVar);
        if (rVar == null) {
            basicMessageChannel7.setMessageHandler(null);
        } else {
            final int i15 = 6;
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pb.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i15) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                rVar2.d((Boolean) ((ArrayList) obj).get(0));
                                arrayList.add(0, null);
                            } catch (Throwable th) {
                                arrayList = W.a.A(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                rVar3.f((Double) ((ArrayList) obj).get(0));
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = W.a.A(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.e((Double) ((ArrayList) obj).get(0));
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = W.a.A(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                Mb.b bVar = (Mb.b) rVar5.f19800d;
                                bVar.getClass();
                                C1830z c1830z = (C1830z) bVar;
                                c1830z.L();
                                c1830z.L();
                                int d8 = c1830z.f21816B.d(c1830z.f21861v0.f21662e, true);
                                c1830z.I(d8, d8 == -1 ? 2 : 1, true);
                                arrayList4.add(0, null);
                            } catch (Throwable th4) {
                                arrayList4 = W.a.A(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                Mb.b bVar2 = (Mb.b) rVar6.f19800d;
                                bVar2.getClass();
                                C1830z c1830z2 = (C1830z) bVar2;
                                c1830z2.L();
                                c1830z2.L();
                                int d10 = c1830z2.f21816B.d(c1830z2.f21861v0.f21662e, false);
                                c1830z2.I(d10, d10 == -1 ? 2 : 1, false);
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = W.a.A(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar7.getClass();
                                long longValue = l9.longValue();
                                Mb.b bVar3 = (Mb.b) rVar7.f19800d;
                                bVar3.getClass();
                                bVar3.j(((C1830z) bVar3).q(), longValue);
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = W.a.A(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            r rVar8 = rVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                InterfaceC1820o interfaceC1820o = rVar8.f19800d;
                                Long valueOf = Long.valueOf(((C1830z) interfaceC1820o).r());
                                Long valueOf2 = Long.valueOf(((C1830z) interfaceC1820o).m());
                                j jVar = new j();
                                jVar.f19784a = valueOf;
                                jVar.f19785b = valueOf2;
                                arrayList7.add(0, jVar);
                            } catch (Throwable th7) {
                                arrayList7 = W.a.A(th7);
                            }
                            reply.reply(arrayList7);
                            break;
                    }
                }
            });
        }
    }
}
