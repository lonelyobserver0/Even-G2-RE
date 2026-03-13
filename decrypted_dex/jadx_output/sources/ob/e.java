package ob;

import Ec.l;
import Xa.AbstractActivityC0364d;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface e {
    static void b(BinaryMessenger binaryMessenger, final a5.c cVar) {
        c cVar2 = c.f18645a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", cVar2);
        if (cVar != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: ob.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    Boolean bool;
                    switch (i3) {
                        case 0:
                            a5.c cVar3 = cVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, cVar3.g((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = l.w(th);
                            }
                            reply.reply(arrayList);
                            return;
                        case 1:
                            a5.c cVar4 = cVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = l.w(th2);
                            }
                            if (((AbstractActivityC0364d) cVar4.f9284d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0364d) cVar4.f9284d).startActivity(new Intent(StubApp.getString2("5111")).setData(Uri.parse(str)).putExtra(StubApp.getString2("8448"), a5.c.n(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            reply.reply(arrayList2);
                            return;
                        case 2:
                            a5.c cVar5 = cVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, cVar5.G((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (f) arrayList5.get(2), (C1474a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = l.w(th3);
                            }
                            reply.reply(arrayList4);
                            return;
                        case 3:
                            a5.c cVar6 = cVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, cVar6.M());
                            } catch (Throwable th4) {
                                arrayList6 = l.w(th4);
                            }
                            reply.reply(arrayList6);
                            return;
                        default:
                            a5.c cVar7 = cVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                cVar7.getClass();
                                ((Context) cVar7.f9282b).sendBroadcast(new Intent(StubApp.getString2("5721")));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = l.w(th5);
                            }
                            reply.reply(arrayList7);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", cVar2);
        if (cVar != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: ob.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            a5.c cVar3 = cVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, cVar3.g((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = l.w(th);
                            }
                            reply.reply(arrayList);
                            return;
                        case 1:
                            a5.c cVar4 = cVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = l.w(th2);
                            }
                            if (((AbstractActivityC0364d) cVar4.f9284d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0364d) cVar4.f9284d).startActivity(new Intent(StubApp.getString2("5111")).setData(Uri.parse(str)).putExtra(StubApp.getString2("8448"), a5.c.n(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            reply.reply(arrayList2);
                            return;
                        case 2:
                            a5.c cVar5 = cVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, cVar5.G((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (f) arrayList5.get(2), (C1474a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = l.w(th3);
                            }
                            reply.reply(arrayList4);
                            return;
                        case 3:
                            a5.c cVar6 = cVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, cVar6.M());
                            } catch (Throwable th4) {
                                arrayList6 = l.w(th4);
                            }
                            reply.reply(arrayList6);
                            return;
                        default:
                            a5.c cVar7 = cVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                cVar7.getClass();
                                ((Context) cVar7.f9282b).sendBroadcast(new Intent(StubApp.getString2("5721")));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = l.w(th5);
                            }
                            reply.reply(arrayList7);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", cVar2);
        if (cVar != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: ob.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            a5.c cVar3 = cVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, cVar3.g((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = l.w(th);
                            }
                            reply.reply(arrayList);
                            return;
                        case 1:
                            a5.c cVar4 = cVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = l.w(th2);
                            }
                            if (((AbstractActivityC0364d) cVar4.f9284d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0364d) cVar4.f9284d).startActivity(new Intent(StubApp.getString2("5111")).setData(Uri.parse(str)).putExtra(StubApp.getString2("8448"), a5.c.n(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            reply.reply(arrayList2);
                            return;
                        case 2:
                            a5.c cVar5 = cVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, cVar5.G((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (f) arrayList5.get(2), (C1474a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = l.w(th3);
                            }
                            reply.reply(arrayList4);
                            return;
                        case 3:
                            a5.c cVar6 = cVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, cVar6.M());
                            } catch (Throwable th4) {
                                arrayList6 = l.w(th4);
                            }
                            reply.reply(arrayList6);
                            return;
                        default:
                            a5.c cVar7 = cVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                cVar7.getClass();
                                ((Context) cVar7.f9282b).sendBroadcast(new Intent(StubApp.getString2("5721")));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = l.w(th5);
                            }
                            reply.reply(arrayList7);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", cVar2);
        if (cVar != null) {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: ob.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            a5.c cVar3 = cVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, cVar3.g((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = l.w(th);
                            }
                            reply.reply(arrayList);
                            return;
                        case 1:
                            a5.c cVar4 = cVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = l.w(th2);
                            }
                            if (((AbstractActivityC0364d) cVar4.f9284d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0364d) cVar4.f9284d).startActivity(new Intent(StubApp.getString2("5111")).setData(Uri.parse(str)).putExtra(StubApp.getString2("8448"), a5.c.n(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            reply.reply(arrayList2);
                            return;
                        case 2:
                            a5.c cVar5 = cVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, cVar5.G((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (f) arrayList5.get(2), (C1474a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = l.w(th3);
                            }
                            reply.reply(arrayList4);
                            return;
                        case 3:
                            a5.c cVar6 = cVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, cVar6.M());
                            } catch (Throwable th4) {
                                arrayList6 = l.w(th4);
                            }
                            reply.reply(arrayList6);
                            return;
                        default:
                            a5.c cVar7 = cVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                cVar7.getClass();
                                ((Context) cVar7.f9282b).sendBroadcast(new Intent(StubApp.getString2("5721")));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = l.w(th5);
                            }
                            reply.reply(arrayList7);
                            return;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", cVar2);
        if (cVar == null) {
            basicMessageChannel5.setMessageHandler(null);
        } else {
            final int i13 = 4;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: ob.d
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            a5.c cVar3 = cVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, cVar3.g((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = l.w(th);
                            }
                            reply.reply(arrayList);
                            return;
                        case 1:
                            a5.c cVar4 = cVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = l.w(th2);
                            }
                            if (((AbstractActivityC0364d) cVar4.f9284d) == null) {
                                throw new b();
                            }
                            try {
                                ((AbstractActivityC0364d) cVar4.f9284d).startActivity(new Intent(StubApp.getString2("5111")).setData(Uri.parse(str)).putExtra(StubApp.getString2("8448"), a5.c.n(map)));
                                bool = Boolean.TRUE;
                            } catch (ActivityNotFoundException unused) {
                                bool = Boolean.FALSE;
                            }
                            arrayList2.add(0, bool);
                            reply.reply(arrayList2);
                            return;
                        case 2:
                            a5.c cVar5 = cVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, cVar5.G((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (f) arrayList5.get(2), (C1474a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = l.w(th3);
                            }
                            reply.reply(arrayList4);
                            return;
                        case 3:
                            a5.c cVar6 = cVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, cVar6.M());
                            } catch (Throwable th4) {
                                arrayList6 = l.w(th4);
                            }
                            reply.reply(arrayList6);
                            return;
                        default:
                            a5.c cVar7 = cVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                cVar7.getClass();
                                ((Context) cVar7.f9282b).sendBroadcast(new Intent(StubApp.getString2("5721")));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = l.w(th5);
                            }
                            reply.reply(arrayList7);
                            return;
                    }
                }
            });
        }
    }
}
