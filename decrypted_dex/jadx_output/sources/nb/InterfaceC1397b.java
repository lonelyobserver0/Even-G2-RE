package nb;

import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.File;
import java.util.ArrayList;

/* renamed from: nb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface InterfaceC1397b {
    static void a(BinaryMessenger binaryMessenger, final C1400e c1400e) {
        BinaryMessenger.TaskQueue makeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
        C1398c c1398c = C1398c.f17888a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", c1398c, makeBackgroundTaskQueue);
        if (c1400e != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nb.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i3) {
                        case 0:
                            C1400e c1400e2 = c1400e;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1400e2.f17891a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0624h2.B(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            C1400e c1400e3 = c1400e;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c1400e3.f17891a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0624h2.B(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            C1400e c1400e4 = c1400e;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c1400e4.f17891a;
                                File dir = context2.getDir(StubApp.getString2("3040"), 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), StubApp.getString2("3041"));
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0624h2.B(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            C1400e c1400e5 = c1400e;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c1400e5.f17891a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0624h2.B(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            C1400e c1400e6 = c1400e;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c1400e6.f17891a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0624h2.B(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            C1400e c1400e7 = c1400e;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1400e7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c1400e7.f17891a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0624h2.B(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            C1400e c1400e8 = c1400e;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c1400e8.b((EnumC1399d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0624h2.B(th7);
                            }
                            reply.reply(arrayList8);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", c1398c, binaryMessenger.makeBackgroundTaskQueue());
        if (c1400e != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nb.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i10) {
                        case 0:
                            C1400e c1400e2 = c1400e;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1400e2.f17891a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0624h2.B(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            C1400e c1400e3 = c1400e;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c1400e3.f17891a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0624h2.B(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            C1400e c1400e4 = c1400e;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c1400e4.f17891a;
                                File dir = context2.getDir(StubApp.getString2("3040"), 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), StubApp.getString2("3041"));
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0624h2.B(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            C1400e c1400e5 = c1400e;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c1400e5.f17891a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0624h2.B(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            C1400e c1400e6 = c1400e;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c1400e6.f17891a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0624h2.B(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            C1400e c1400e7 = c1400e;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1400e7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c1400e7.f17891a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0624h2.B(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            C1400e c1400e8 = c1400e;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c1400e8.b((EnumC1399d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0624h2.B(th7);
                            }
                            reply.reply(arrayList8);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", c1398c, binaryMessenger.makeBackgroundTaskQueue());
        if (c1400e != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nb.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i11) {
                        case 0:
                            C1400e c1400e2 = c1400e;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1400e2.f17891a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0624h2.B(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            C1400e c1400e3 = c1400e;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c1400e3.f17891a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0624h2.B(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            C1400e c1400e4 = c1400e;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c1400e4.f17891a;
                                File dir = context2.getDir(StubApp.getString2("3040"), 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), StubApp.getString2("3041"));
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0624h2.B(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            C1400e c1400e5 = c1400e;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c1400e5.f17891a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0624h2.B(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            C1400e c1400e6 = c1400e;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c1400e6.f17891a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0624h2.B(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            C1400e c1400e7 = c1400e;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1400e7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c1400e7.f17891a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0624h2.B(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            C1400e c1400e8 = c1400e;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c1400e8.b((EnumC1399d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0624h2.B(th7);
                            }
                            reply.reply(arrayList8);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", c1398c, binaryMessenger.makeBackgroundTaskQueue());
        if (c1400e != null) {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nb.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i12) {
                        case 0:
                            C1400e c1400e2 = c1400e;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1400e2.f17891a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0624h2.B(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            C1400e c1400e3 = c1400e;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c1400e3.f17891a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0624h2.B(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            C1400e c1400e4 = c1400e;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c1400e4.f17891a;
                                File dir = context2.getDir(StubApp.getString2("3040"), 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), StubApp.getString2("3041"));
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0624h2.B(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            C1400e c1400e5 = c1400e;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c1400e5.f17891a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0624h2.B(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            C1400e c1400e6 = c1400e;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c1400e6.f17891a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0624h2.B(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            C1400e c1400e7 = c1400e;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1400e7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c1400e7.f17891a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0624h2.B(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            C1400e c1400e8 = c1400e;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c1400e8.b((EnumC1399d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0624h2.B(th7);
                            }
                            reply.reply(arrayList8);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", c1398c, binaryMessenger.makeBackgroundTaskQueue());
        if (c1400e != null) {
            final int i13 = 4;
            basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nb.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i13) {
                        case 0:
                            C1400e c1400e2 = c1400e;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1400e2.f17891a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0624h2.B(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            C1400e c1400e3 = c1400e;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c1400e3.f17891a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0624h2.B(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            C1400e c1400e4 = c1400e;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c1400e4.f17891a;
                                File dir = context2.getDir(StubApp.getString2("3040"), 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), StubApp.getString2("3041"));
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0624h2.B(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            C1400e c1400e5 = c1400e;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c1400e5.f17891a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0624h2.B(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            C1400e c1400e6 = c1400e;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c1400e6.f17891a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0624h2.B(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            C1400e c1400e7 = c1400e;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1400e7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c1400e7.f17891a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0624h2.B(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            C1400e c1400e8 = c1400e;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c1400e8.b((EnumC1399d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0624h2.B(th7);
                            }
                            reply.reply(arrayList8);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", c1398c, binaryMessenger.makeBackgroundTaskQueue());
        if (c1400e != null) {
            final int i14 = 5;
            basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nb.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i14) {
                        case 0:
                            C1400e c1400e2 = c1400e;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1400e2.f17891a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0624h2.B(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            C1400e c1400e3 = c1400e;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c1400e3.f17891a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0624h2.B(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            C1400e c1400e4 = c1400e;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c1400e4.f17891a;
                                File dir = context2.getDir(StubApp.getString2("3040"), 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), StubApp.getString2("3041"));
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0624h2.B(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            C1400e c1400e5 = c1400e;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c1400e5.f17891a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0624h2.B(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            C1400e c1400e6 = c1400e;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c1400e6.f17891a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0624h2.B(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            C1400e c1400e7 = c1400e;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1400e7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c1400e7.f17891a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0624h2.B(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            C1400e c1400e8 = c1400e;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c1400e8.b((EnumC1399d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0624h2.B(th7);
                            }
                            reply.reply(arrayList8);
                            break;
                    }
                }
            });
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", c1398c, binaryMessenger.makeBackgroundTaskQueue());
        if (c1400e == null) {
            basicMessageChannel7.setMessageHandler(null);
        } else {
            final int i15 = 6;
            basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: nb.a
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    switch (i15) {
                        case 0:
                            C1400e c1400e2 = c1400e;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c1400e2.f17891a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0624h2.B(th);
                            }
                            reply.reply(arrayList);
                            break;
                        case 1:
                            C1400e c1400e3 = c1400e;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c1400e3.f17891a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), StubApp.getString2("3038"));
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0624h2.B(th2);
                            }
                            reply.reply(arrayList2);
                            break;
                        case 2:
                            C1400e c1400e4 = c1400e;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c1400e4.f17891a;
                                File dir = context2.getDir(StubApp.getString2("3040"), 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), StubApp.getString2("3041"));
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0624h2.B(th3);
                            }
                            reply.reply(arrayList3);
                            break;
                        case 3:
                            C1400e c1400e5 = c1400e;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c1400e5.f17891a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0624h2.B(th4);
                            }
                            reply.reply(arrayList4);
                            break;
                        case 4:
                            C1400e c1400e6 = c1400e;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c1400e6.f17891a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0624h2.B(th5);
                            }
                            reply.reply(arrayList5);
                            break;
                        case 5:
                            C1400e c1400e7 = c1400e;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c1400e7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c1400e7.f17891a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0624h2.B(th6);
                            }
                            reply.reply(arrayList6);
                            break;
                        default:
                            C1400e c1400e8 = c1400e;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c1400e8.b((EnumC1399d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0624h2.B(th7);
                            }
                            reply.reply(arrayList8);
                            break;
                    }
                }
            });
        }
    }
}
