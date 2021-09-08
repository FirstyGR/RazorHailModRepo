// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer rightear;
	private final ModelRenderer leftEar;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer rightArm2;
	private final ModelRenderer LegL;
	private final ModelRenderer LegR;

	public Modelsteve() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -32.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -12.0F, 0.0F);
		Body.setTextureOffset(32, 32).addBox(-8.0F, -12.0F, -4.0F, 16.0F, 24.0F, 8.0F, 0.0F, false);

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(-5.3571F, -42.0F, -0.5714F);
		rightear.setTextureOffset(117, 11).addBox(-2.6429F, -1.0F, -1.4286F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(120, 49).addBox(0.3571F, -1.0F, -1.4286F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(118, 65).addBox(0.3571F, 0.0F, 0.5714F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		rightear.setTextureOffset(115, 4).addBox(-1.6429F, -1.0F, 0.5714F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		rightear.setTextureOffset(116, 33).addBox(-1.6429F, -2.0F, -1.4286F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(118, 19).addBox(-0.6429F, -3.0F, -1.4286F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(110, 87).addBox(1.3571F, 0.0F, -1.4286F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		leftEar = new ModelRenderer(this);
		leftEar.setRotationPoint(5.3571F, -42.1429F, -0.5714F);
		leftEar.setTextureOffset(116, 47).addBox(1.6429F, -0.8571F, -1.4286F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		leftEar.setTextureOffset(116, 52).addBox(-0.3571F, -1.8571F, -1.4286F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		leftEar.setTextureOffset(119, 51).addBox(-0.3571F, -0.8571F, 0.5714F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		leftEar.setTextureOffset(120, 54).addBox(-1.3571F, 0.1429F, 0.5714F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftEar.setTextureOffset(114, 10).addBox(-0.3571F, -2.8571F, -1.4286F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftEar.setTextureOffset(115, 28).addBox(-1.3571F, -0.8571F, -1.4286F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leftEar.setTextureOffset(117, 30).addBox(-2.3571F, 0.1429F, -1.4286F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setRotationPoint(8.0F, -24.0F, 0.0F);
		LeftArm2.setTextureOffset(64, 96).addBox(0.0F, 0.0F, -4.0F, 8.0F, 13.0F, 8.0F, 0.0F, false);
		LeftArm2.setTextureOffset(64, 109).addBox(0.0F, 13.0F, -4.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);

		rightArm2 = new ModelRenderer(this);
		rightArm2.setRotationPoint(-8.0F, -24.0F, 0.0F);
		rightArm2.setTextureOffset(64, 96).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 13.0F, 8.0F, 0.0F, false);
		rightArm2.setTextureOffset(64, 109).addBox(-8.0F, 13.0F, -4.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);

		LegL = new ModelRenderer(this);
		LegL.setRotationPoint(-5.0F, 0.0F, 0.0F);
		LegL.setTextureOffset(0, 32).addBox(-3.0F, 0.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		LegL.setTextureOffset(0, 42).addBox(-3.0F, 10.0F, -4.0F, 8.0F, 14.0F, 8.0F, 0.0F, false);

		LegR = new ModelRenderer(this);
		LegR.setRotationPoint(5.0F, 0.0F, 0.0F);
		LegR.setTextureOffset(31, 96).addBox(-5.0F, 0.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		LegR.setTextureOffset(32, 106).addBox(-5.0F, 10.0F, -4.0F, 8.0F, 14.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightear.render(matrixStack, buffer, packedLight, packedOverlay);
		leftEar.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm2.render(matrixStack, buffer, packedLight, packedOverlay);
		LegL.render(matrixStack, buffer, packedLight, packedOverlay);
		LegR.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LegR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftEar.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.leftEar.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightArm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftArm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.LegL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.rightear.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.rightear.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}