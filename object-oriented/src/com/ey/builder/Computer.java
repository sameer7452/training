package com.ey.builder;

public class Computer {

	private String cpu;
	private int ram;
	private int hdd;
	private String gpu;
	private int ssd;
	
	public Computer(PCBuilder builder) {
		this.cpu=builder.cpu;
		this.ram=builder.ram;
		this.hdd=builder.hdd;
		this.gpu=builder.gpu;
		this.ssd=builder.ssd;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + ", gpu=" + gpu + ", ssd=" + ssd + "]";
	}
	
	public static class PCBuilder{

		private String cpu;
		private int ram;
		private int hdd;
		private String gpu;
		private int ssd;
		
		public PCBuilder(String cpu, int ram, int hdd) {
			this.cpu = cpu;
			this.ram = ram;
			this.hdd = hdd;
		}

		public PCBuilder setGpu(String gpu) {
			this.gpu = gpu;
			return this;
		}

		public PCBuilder setSsd(int ssd) {
			this.ssd = ssd;
			return this;
		}
		
		public Computer build() {
			Computer pc=new Computer(this);
			return pc;
		}


	};
	
}
