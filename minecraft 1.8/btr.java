/*   1:    */ public enum btr
/*   2:    */ {
/*   3:    */   private final boolean R;
/*   4:    */   private final boolean S;
/*   5:    */   private final String T;
/*   6:    */   private final float U;
/*   7:    */   private float V;
/*   8:    */   private float W;
/*   9:    */   
/*  10:    */   public static btr a(int paramInt)
/*  11:    */   {
/*  12:138 */     for (btr localbtr : ) {
/*  13:139 */       if (localbtr.c() == paramInt) {
/*  14:140 */         return localbtr;
/*  15:    */       }
/*  16:    */     }
/*  17:143 */     return null;
/*  18:    */   }
/*  19:    */   
/*  20:    */   private btr(String paramString, boolean paramBoolean1, boolean paramBoolean2)
/*  21:    */   {
/*  22:147 */     this(paramString, paramBoolean1, paramBoolean2, 0.0F, 1.0F, 0.0F);
/*  23:    */   }
/*  24:    */   
/*  25:    */   private btr(String paramString, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3)
/*  26:    */   {
/*  27:151 */     this.T = paramString;
/*  28:152 */     this.R = paramBoolean1;
/*  29:153 */     this.S = paramBoolean2;
/*  30:154 */     this.V = paramFloat1;
/*  31:155 */     this.W = paramFloat2;
/*  32:156 */     this.U = paramFloat3;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean a()
/*  36:    */   {
/*  37:160 */     return this.R;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean b()
/*  41:    */   {
/*  42:164 */     return this.S;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int c()
/*  46:    */   {
/*  47:168 */     return ordinal();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String d()
/*  51:    */   {
/*  52:172 */     return this.T;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public float f()
/*  56:    */   {
/*  57:180 */     return this.W;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(float paramFloat)
/*  61:    */   {
/*  62:188 */     this.W = paramFloat;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public float c(float paramFloat)
/*  66:    */   {
/*  67:196 */     return uv.a((e(paramFloat) - this.V) / (this.W - this.V), 0.0F, 1.0F);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public float d(float paramFloat)
/*  71:    */   {
/*  72:200 */     return e(this.V + (this.W - this.V) * uv.a(paramFloat, 0.0F, 1.0F));
/*  73:    */   }
/*  74:    */   
/*  75:    */   public float e(float paramFloat)
/*  76:    */   {
/*  77:204 */     paramFloat = f(paramFloat);
/*  78:205 */     return uv.a(paramFloat, this.V, this.W);
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected float f(float paramFloat)
/*  82:    */   {
/*  83:209 */     if (this.U > 0.0F) {
/*  84:210 */       paramFloat = this.U * Math.round(paramFloat / this.U);
/*  85:    */     }
/*  86:212 */     return paramFloat;
/*  87:    */   }
/*  88:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     btr
 * JD-Core Version:    0.7.0.1
 */