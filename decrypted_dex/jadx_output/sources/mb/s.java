package mb;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface s {
    static void a(BinaryMessenger binaryMessenger, final i iVar) {
        BinaryMessenger.TaskQueue makeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
        v vVar = v.f17349a;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages", vVar, makeBackgroundTaskQueue);
        if (iVar != null) {
            final int i3 = 0;
            basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: mb.o
                /* JADX WARN: Code restructure failed: missing block: B:114:0x02bc, code lost:
                
                    if (r3 >= 2) goto L119;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:121:0x02dd, code lost:
                
                    if (r2 >= 2) goto L128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:169:0x03f5, code lost:
                
                    if (r3 >= 2) goto L172;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:176:0x0416, code lost:
                
                    if (r2 >= 2) goto L181;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:196:0x0483, code lost:
                
                    if (r3 >= 2) goto L200;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:203:0x04a4, code lost:
                
                    if (r2 >= 2) goto L209;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
                
                    if (r12 >= 2) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
                
                    if (r2 >= 2) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
                
                    if (r12 >= 2) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
                
                    if (r3 >= 2) goto L57;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x022e, code lost:
                
                    if (r3 >= 2) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x024f, code lost:
                
                    if (r2 >= 2) goto L100;
                 */
                /* JADX WARN: Removed duplicated region for block: B:118:0x02d4  */
                /* JADX WARN: Removed duplicated region for block: B:173:0x040d  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x049b  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onMessage(java.lang.Object r18, io.flutter.plugin.common.BasicMessageChannel.Reply r19) {
                    /*
                        Method dump skipped, instructions count: 1296
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mb.o.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos", vVar, makeBackgroundTaskQueue);
        if (iVar != null) {
            final int i10 = 1;
            basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: mb.o
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 1296
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mb.o.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia", vVar);
        if (iVar != null) {
            final int i11 = 2;
            basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: mb.o
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 1296
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mb.o.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults", vVar, makeBackgroundTaskQueue);
        if (iVar == null) {
            basicMessageChannel4.setMessageHandler(null);
        } else {
            final int i12 = 3;
            basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: mb.o
                @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                    /*
                        Method dump skipped, instructions count: 1296
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mb.o.onMessage(java.lang.Object, io.flutter.plugin.common.BasicMessageChannel$Reply):void");
                }
            });
        }
    }
}
