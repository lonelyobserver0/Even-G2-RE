package no.nordicsemi.android.dfu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.stub.StubApp;
import java.security.InvalidParameterException;
import java.util.UUID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class DfuServiceInitiator {
    public static final int DEFAULT_MBR_SIZE = 4096;
    public static final int DEFAULT_PRN_VALUE = 12;
    public static final long DEFAULT_SCAN_TIMEOUT = 5000;
    public static final int SCOPE_APPLICATION = 2;
    public static final int SCOPE_SYSTEM_COMPONENTS = 1;
    private Parcelable[] buttonlessDfuWithBondSharingUuids;
    private Parcelable[] buttonlessDfuWithoutBondSharingUuids;
    private final String deviceAddress;
    private String deviceName;
    private Parcelable[] experimentalButtonlessDfuUuids;
    private String filePath;
    private int fileResId;
    private Uri fileUri;
    private String initFilePath;
    private int initFileResId;
    private Uri initFileUri;
    private boolean keepBond;
    private Parcelable[] legacyDfuUuids;
    private String mimeType;
    private Boolean packetReceiptNotificationsEnabled;
    private boolean restoreBond;
    private Parcelable[] secureDfuUuids;
    private boolean disableNotification = false;
    private boolean startAsForegroundService = true;
    private int fileType = -1;
    private boolean forceDfu = false;
    private boolean forceScanningForNewAddressInLegacyDfu = false;
    private boolean enableUnsafeExperimentalButtonlessDfu = false;
    private boolean disableResume = false;
    private int numberOfRetries = 0;
    private int mbrSize = 4096;
    private long dataObjectDelay = 0;
    private long rebootTime = 0;
    private long scanTimeout = DEFAULT_SCAN_TIMEOUT;
    private int numberOfPackets = 12;
    private int mtu = 517;
    private int currentMtu = 23;

    public DfuServiceInitiator(String str) {
        this.deviceAddress = str;
    }

    public static void createDfuNotificationChannel(Context context, String str, String str2, boolean z2) {
        NotificationChannel notificationChannel = new NotificationChannel(StubApp.getString2(26414), str, 2);
        notificationChannel.setDescription(str2);
        notificationChannel.setShowBadge(z2);
        notificationChannel.setLockscreenVisibility(1);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(StubApp.getString2(490));
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private DfuServiceInitiator init(Uri uri, String str, int i3) {
        if (StubApp.getString2(20996).equals(this.mimeType)) {
            throw new InvalidParameterException(StubApp.getString2(26500));
        }
        this.initFileUri = uri;
        this.initFilePath = str;
        this.initFileResId = i3;
        return this;
    }

    public DfuServiceInitiator disableMtuRequest() {
        this.mtu = 0;
        return this;
    }

    public DfuServiceInitiator disableResume() {
        this.disableResume = true;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i3, Uri uri) {
        if (i3 != 0) {
            return init(uri, null, 0, i3, StubApp.getString2(1267));
        }
        throw new UnsupportedOperationException(StubApp.getString2(26501));
    }

    public DfuServiceInitiator setCurrentMtu(int i3) {
        this.currentMtu = i3;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithBondSharing(UUID uuid, UUID uuid2) {
        this.buttonlessDfuWithBondSharingUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithoutBondSharing(UUID uuid, UUID uuid2) {
        this.buttonlessDfuWithoutBondSharingUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForExperimentalButtonlessDfu(UUID uuid, UUID uuid2) {
        this.experimentalButtonlessDfuUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForLegacyDfu(UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4) {
        this.legacyDfuUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null, uuid3 != null ? new ParcelUuid(uuid3) : null, uuid4 != null ? new ParcelUuid(uuid4) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForSecureDfu(UUID uuid, UUID uuid2, UUID uuid3) {
        this.secureDfuUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null, uuid3 != null ? new ParcelUuid(uuid3) : null};
        return this;
    }

    public DfuServiceInitiator setDeviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public DfuServiceInitiator setDisableNotification(boolean z2) {
        this.disableNotification = z2;
        return this;
    }

    public DfuServiceInitiator setForceDfu(boolean z2) {
        this.forceDfu = z2;
        return this;
    }

    public DfuServiceInitiator setForceScanningForNewAddressInLegacyDfu(boolean z2) {
        this.forceScanningForNewAddressInLegacyDfu = z2;
        return this;
    }

    public DfuServiceInitiator setForeground(boolean z2) {
        this.startAsForegroundService = z2;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(Uri uri) {
        return init(uri, null, 0);
    }

    public DfuServiceInitiator setKeepBond(boolean z2) {
        this.keepBond = z2;
        return this;
    }

    public DfuServiceInitiator setMbrSize(int i3) {
        this.mbrSize = i3;
        return this;
    }

    public DfuServiceInitiator setMtu(int i3) {
        this.mtu = i3;
        return this;
    }

    public DfuServiceInitiator setNumberOfRetries(int i3) {
        this.numberOfRetries = i3;
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsEnabled(boolean z2) {
        this.packetReceiptNotificationsEnabled = Boolean.valueOf(z2);
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsValue(int i3) {
        if (i3 <= 0) {
            i3 = 12;
        }
        this.numberOfPackets = i3;
        return this;
    }

    public DfuServiceInitiator setPrepareDataObjectDelay(long j) {
        this.dataObjectDelay = j;
        return this;
    }

    public DfuServiceInitiator setRebootTime(long j) {
        this.rebootTime = j;
        return this;
    }

    public DfuServiceInitiator setRestoreBond(boolean z2) {
        this.restoreBond = z2;
        return this;
    }

    public DfuServiceInitiator setScanTimeout(long j) {
        this.scanTimeout = j;
        return this;
    }

    public DfuServiceInitiator setScope(int i3) {
        if (!StubApp.getString2(20996).equals(this.mimeType)) {
            throw new UnsupportedOperationException(StubApp.getString2(26503));
        }
        if (i3 == 2) {
            this.fileType = 4;
            return this;
        }
        if (i3 == 1) {
            this.fileType = 3;
            return this;
        }
        if (i3 != 3) {
            throw new UnsupportedOperationException(StubApp.getString2(26502));
        }
        this.fileType = 0;
        return this;
    }

    public DfuServiceInitiator setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(boolean z2) {
        this.enableUnsafeExperimentalButtonlessDfu = z2;
        return this;
    }

    public DfuServiceInitiator setZip(Uri uri) {
        return init(uri, null, 0, 0, StubApp.getString2(20996));
    }

    public DfuServiceController start(Context context, Class<? extends DfuBaseService> cls) {
        if (this.fileType == -1) {
            throw new UnsupportedOperationException(StubApp.getString2(26504));
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra(StubApp.getString2(26362), this.deviceAddress);
        intent.putExtra(StubApp.getString2(26415), this.deviceName);
        intent.putExtra(StubApp.getString2(26440), this.disableNotification);
        intent.putExtra(StubApp.getString2(26364), this.startAsForegroundService);
        intent.putExtra(StubApp.getString2(26297), this.mimeType);
        intent.putExtra(StubApp.getString2(26298), this.fileType);
        intent.putExtra(StubApp.getString2(26442), this.fileUri);
        intent.putExtra(StubApp.getString2(26441), this.filePath);
        intent.putExtra(StubApp.getString2(26443), this.fileResId);
        intent.putExtra(StubApp.getString2(26445), this.initFileUri);
        intent.putExtra(StubApp.getString2(26444), this.initFilePath);
        intent.putExtra(StubApp.getString2(26446), this.initFileResId);
        intent.putExtra(StubApp.getString2(26275), this.keepBond);
        intent.putExtra(StubApp.getString2(26294), this.restoreBond);
        intent.putExtra(StubApp.getString2(26496), this.forceDfu);
        intent.putExtra(StubApp.getString2(26497), this.forceScanningForNewAddressInLegacyDfu);
        intent.putExtra(StubApp.getString2(26495), this.disableResume);
        intent.putExtra(StubApp.getString2(26471), this.numberOfRetries);
        intent.putExtra(StubApp.getString2(26452), this.mbrSize);
        intent.putExtra(StubApp.getString2(26494), this.dataObjectDelay);
        intent.putExtra(StubApp.getString2(26356), this.scanTimeout);
        intent.putExtra(StubApp.getString2(26355), this.rebootTime);
        int i3 = this.mtu;
        if (i3 > 0) {
            intent.putExtra(StubApp.getString2(26498), i3);
        }
        intent.putExtra(StubApp.getString2(26340), this.currentMtu);
        intent.putExtra(StubApp.getString2(26499), this.enableUnsafeExperimentalButtonlessDfu);
        Boolean bool = this.packetReceiptNotificationsEnabled;
        if (bool != null) {
            intent.putExtra(StubApp.getString2(26281), bool);
            intent.putExtra(StubApp.getString2(26282), this.numberOfPackets);
        }
        Parcelable[] parcelableArr = this.legacyDfuUuids;
        if (parcelableArr != null) {
            intent.putExtra(StubApp.getString2(26492), parcelableArr);
        }
        Parcelable[] parcelableArr2 = this.secureDfuUuids;
        if (parcelableArr2 != null) {
            intent.putExtra(StubApp.getString2(26493), parcelableArr2);
        }
        Parcelable[] parcelableArr3 = this.experimentalButtonlessDfuUuids;
        if (parcelableArr3 != null) {
            intent.putExtra(StubApp.getString2(26491), parcelableArr3);
        }
        Parcelable[] parcelableArr4 = this.buttonlessDfuWithoutBondSharingUuids;
        if (parcelableArr4 != null) {
            intent.putExtra(StubApp.getString2(26489), parcelableArr4);
        }
        Parcelable[] parcelableArr5 = this.buttonlessDfuWithBondSharingUuids;
        if (parcelableArr5 != null) {
            intent.putExtra(StubApp.getString2(26490), parcelableArr5);
        }
        if (this.startAsForegroundService) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
        return new DfuServiceController(context);
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(String str) {
        return init(null, str, 0);
    }

    public DfuServiceInitiator setZip(String str) {
        return init(null, str, 0, 0, StubApp.getString2(20996));
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i3, String str) {
        if (i3 != 0) {
            return init(null, str, 0, i3, StubApp.getString2(1267));
        }
        throw new UnsupportedOperationException(StubApp.getString2(26501));
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(int i3) {
        return init(null, null, i3);
    }

    public DfuServiceInitiator setZip(int i3) {
        return init(null, null, i3, 0, StubApp.getString2(20996));
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(Uri uri, String str) {
        return init(uri, str, 0);
    }

    public DfuServiceInitiator setZip(Uri uri, String str) {
        return init(uri, str, 0, 0, StubApp.getString2(20996));
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i3, Uri uri, String str) {
        if (i3 != 0) {
            return init(uri, str, 0, i3, StubApp.getString2(1267));
        }
        throw new UnsupportedOperationException(StubApp.getString2(26501));
    }

    private DfuServiceInitiator init(Uri uri, String str, int i3, int i10, String str2) {
        this.fileUri = uri;
        this.filePath = str;
        this.fileResId = i3;
        this.fileType = i10;
        this.mimeType = str2;
        if (StubApp.getString2(20996).equals(str2)) {
            this.initFileUri = null;
            this.initFilePath = null;
            this.initFileResId = 0;
        }
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i3, int i10) {
        if (i3 != 0) {
            return init(null, null, i10, i3, StubApp.getString2(1267));
        }
        throw new UnsupportedOperationException(StubApp.getString2(26501));
    }

    public static void createDfuNotificationChannel(Context context) {
        createDfuNotificationChannel(context, context.getString(R.string.dfu_channel_name), context.getString(R.string.dfu_channel_description), false);
    }
}
