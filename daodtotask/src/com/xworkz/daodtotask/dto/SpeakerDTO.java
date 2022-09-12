package com.xworkz.daodtotask.dto;

public class SpeakerDTO {

	private String speakerName;
	private String brandName;
	private String color;
	private String deviceType;
	private String deviceConfiguration;
	private String deviceConfigurationDetails;
	private String totalPowerOutput;
	private String connectivity;
	private int modelNumber;
	private String frequencyRespose;
	private String signalToNoiseRatio;
	private String bluethoothSpecifications;
	private double bluethoothRangeUpto;
	private double batteryCapacity;
	private int standardBattery;

	public SpeakerDTO() {
		System.out.println("default const");
	}

	@Override
	public String toString() {
		return "SpeakerDTO [speakerName=" + speakerName + ", brandName=" + brandName + ", color=" + color
				+ ", deviceType=" + deviceType + ", deviceConfiguration=" + deviceConfiguration
				+ ", deviceConfigurationDetails=" + deviceConfigurationDetails + ", totalPowerOutput="
				+ totalPowerOutput + ", connectivity=" + connectivity + ", modelNumber=" + modelNumber
				+ ", frequencyRespose=" + frequencyRespose + ", signalToNoiseRatio=" + signalToNoiseRatio
				+ ", bluethoothSpecifications=" + bluethoothSpecifications + ", bluethoothRangeUpto="
				+ bluethoothRangeUpto + ", batteryCapacity=" + batteryCapacity + ", standardBattery=" + standardBattery
				+ "]";
	}

	public String getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceConfiguration() {
		return deviceConfiguration;
	}

	public void setDeviceConfiguration(String deviceConfiguration) {
		this.deviceConfiguration = deviceConfiguration;
	}

	public String getDeviceConfigurationDetails() {
		return deviceConfigurationDetails;
	}

	public void setDeviceConfigurationDetails(String deviceConfigurationDetails) {
		this.deviceConfigurationDetails = deviceConfigurationDetails;
	}

	public String getTotalPowerOutput() {
		return totalPowerOutput;
	}

	public void setTotalPowerOutput(String totalPowerOutput) {
		this.totalPowerOutput = totalPowerOutput;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getFrequencyRespose() {
		return frequencyRespose;
	}

	public void setFrequencyRespose(String frequencyRespose) {
		this.frequencyRespose = frequencyRespose;
	}

	public String getSignalToNoiseRatio() {
		return signalToNoiseRatio;
	}

	public void setSignalToNoiseRatio(String signalToNoiseRatio) {
		this.signalToNoiseRatio = signalToNoiseRatio;
	}

	public String getBluethoothSpecifications() {
		return bluethoothSpecifications;
	}

	public void setBluethoothSpecifications(String bluethoothSpecifications) {
		this.bluethoothSpecifications = bluethoothSpecifications;
	}

	public double getBluethoothRangeUpto() {
		return bluethoothRangeUpto;
	}

	public void setBluethoothRangeUpto(double bluethoothRangeUpto) {
		this.bluethoothRangeUpto = bluethoothRangeUpto;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getStandardBattery() {
		return standardBattery;
	}

	public void setStandardBattery(int standardBattery) {
		this.standardBattery = standardBattery;
	}

}
