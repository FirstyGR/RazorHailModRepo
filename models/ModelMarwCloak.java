// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelMarwCloak extends EntityModel<Entity> {
	private final ModelRenderer Hood;
	private final ModelRenderer cape;
	private final ModelRenderer armright;
	private final ModelRenderer rleg;
	private final ModelRenderer lleg;
	private final ModelRenderer armleft;

	public ModelMarwCloak() {
		textureWidth = 64;
		textureHeight = 64;

		Hood = new ModelRenderer(this);
		Hood.setRotationPoint(0.0F, 0.0F, 0.0F);

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.0F, 0.0F);
		cape.setTextureOffset(0, 0).addBox(-3.75F, 0.0F, -4.0F, 3.0F, 12.0F, 1.0F, 0.0F, false);
		cape.setTextureOffset(0, 0).addBox(0.75F, 0.0F, -4.0F, 3.0F, 12.0F, 1.0F, 0.0F, false);

		armright = new ModelRenderer(this);
		armright.setRotationPoint(-6.0F, 2.0F, 0.0F);
		armright.setTextureOffset(0, 0).addBox(-2.75F, -2.0F, -4.0F, 1.0F, 12.0F, 7.0F, 0.0F, false);
		armright.setTextureOffset(0, 0).addBox(-1.75F, -2.75F, -4.0F, 4.0F, 13.0F, 1.0F, 0.0F, false);
		armright.setTextureOffset(0, 0).addBox(-2.7891F, -2.8657F, -4.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);

		rleg = new ModelRenderer(this);
		rleg.setRotationPoint(-3.0F, 14.0F, 0.0F);
		rleg.setTextureOffset(0, 0).addBox(-4.75F, -2.0F, -4.0F, 4.0F, 12.0F, 1.0F, 0.0F, false);
		rleg.setTextureOffset(0, 0).addBox(-5.75F, -2.0F, -4.0F, 1.0F, 12.0F, 7.0F, 0.0F, false);
		rleg.setTextureOffset(0, 0).addBox(-0.75F, -2.0F, -4.0F, 3.0F, 12.0F, 1.0F, 0.0F, false);

		lleg = new ModelRenderer(this);
		lleg.setRotationPoint(2.0F, 14.0F, 0.0F);
		lleg.setTextureOffset(0, 0).addBox(-1.25F, -2.0F, -4.0F, 3.0F, 12.0F, 1.0F, 0.0F, false);
		lleg.setTextureOffset(0, 0).addBox(1.75F, -2.0F, -4.0F, 4.0F, 12.0F, 1.0F, 0.0F, false);
		lleg.setTextureOffset(0, 0).addBox(5.75F, -2.0F, -4.0F, 1.0F, 12.0F, 7.0F, 0.0F, false);

		armleft = new ModelRenderer(this);
		armleft.setRotationPoint(6.0F, 2.0F, 0.0F);
		armleft.setTextureOffset(0, 0).addBox(1.75F, -2.0F, -4.0F, 1.0F, 12.0F, 7.0F, 0.0F, false);
		armleft.setTextureOffset(0, 0).addBox(-2.25F, -2.75F, -4.0F, 4.0F, 13.0F, 1.0F, 0.0F, false);
		armleft.setTextureOffset(0, 0).addBox(-2.1983F, -2.8478F, -4.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Hood.render(matrixStack, buffer, packedLight, packedOverlay);
		cape.render(matrixStack, buffer, packedLight, packedOverlay);
		armright.render(matrixStack, buffer, packedLight, packedOverlay);
		rleg.render(matrixStack, buffer, packedLight, packedOverlay);
		lleg.render(matrixStack, buffer, packedLight, packedOverlay);
		armleft.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.armright.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.armleft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Hood.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Hood.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}