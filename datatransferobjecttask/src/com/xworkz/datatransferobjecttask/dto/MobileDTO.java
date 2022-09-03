package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {

	private String brand;
	private Integer storage;
	private String processor;
	private String model;
	private String uiVersion;
	private Double ram;
	private Integer androidVersion;
	private String buildNumber;
	private String basedbandVersion;
	private String kernelVersion;
	private String colorsOSVersion;
	private String hardwareVersion;
	private String network;
	private String signaleStrength;
	private String mobileNetworkType;
	private Boolean roaming;
	private Long phno;
	private String batteryStatus;
	private Integer batteryLevel;
	private Integer imeisv;
	private String id;
	private String wifiMacAddress;
	private String bluetoothAddress;
	private String swerialNo;
	private String upTime;

	public MobileDTO() {

		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 34278;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof MobileDTO) {
				System.out.println("obj is instance of MobileDTO");
				MobileDTO convo = (MobileDTO) obj;
				String ref = convo.brand;
				Integer ref2 = convo.storage;
				String ref3 = convo.processor;
				String ref4 = convo.model;
				String ref5 = convo.uiVersion;
				Double ref6 = convo.ram;

				if (brand.equals(ref) && storage.equals(ref2) && processor.equals(ref3) && model.equals(ref4)
						&& uiVersion.equals(ref5) && ram.equals(ref6)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUiVersion() {
		return uiVersion;
	}

	public void setUiVersion(String uiVersion) {
		this.uiVersion = uiVersion;
	}

	public Double getRam() {
		return ram;
	}

	public void setRam(Double ram) {
		this.ram = ram;
	}

	public Integer getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(Integer androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public String getBasedbandVersion() {
		return basedbandVersion;
	}

	public void setBasedbandVersion(String basedbandVersion) {
		this.basedbandVersion = basedbandVersion;
	}

	public String getKernelVersion() {
		return kernelVersion;
	}

	public void setKernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
	}

	public String getColorsOSVersion() {
		return colorsOSVersion;
	}

	public void setColorsOSVersion(String colorsOSVersion) {
		this.colorsOSVersion = colorsOSVersion;
	}

	public String getHardwareVersion() {
		return hardwareVersion;
	}

	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getSignaleStrength() {
		return signaleStrength;
	}

	public void setSignaleStrength(String signaleStrength) {
		this.signaleStrength = signaleStrength;
	}

	public String getMobileNetworkType() {
		return mobileNetworkType;
	}

	public void setMobileNetworkType(String mobileNetworkType) {
		this.mobileNetworkType = mobileNetworkType;
	}

	public Boolean getRoaming() {
		return roaming;
	}

	public void setRoaming(Boolean roaming) {
		this.roaming = roaming;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getBatteryStatus() {
		return batteryStatus;
	}

	public void setBatteryStatus(String batteryStatus) {
		this.batteryStatus = batteryStatus;
	}

	public Integer getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(Integer batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public Integer getImeisv() {
		return imeisv;
	}

	public void setImeisv(Integer imeisv) {
		this.imeisv = imeisv;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWifiMacAddress() {
		return wifiMacAddress;
	}

	public void setWifiMacAddress(String wifiMacAddress) {
		this.wifiMacAddress = wifiMacAddress;
	}

	public String getBluetoothAddress() {
		return bluetoothAddress;
	}

	public void setBluetoothAddress(String bluetoothAddress) {
		this.bluetoothAddress = bluetoothAddress;
	}

	public String getSwerialNo() {
		return swerialNo;
	}

	public void setSwerialNo(String swerialNo) {
		this.swerialNo = swerialNo;
	}

	public String getUpTime() {
		return upTime;
	}

	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}

}
