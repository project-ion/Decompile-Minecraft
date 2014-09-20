/*   1:    */ public class aek
/*   2:    */   extends wv
/*   3:    */ {
/*   4:    */   public int a;
/*   5:    */   private xm b;
/*   6:    */   
/*   7:    */   public aek(aqu paramaqu)
/*   8:    */   {
/*   9: 17 */     super(paramaqu);
/*  10: 18 */     this.k = true;
/*  11: 19 */     a(0.98F, 0.98F);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public aek(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, xm paramxm)
/*  15:    */   {
/*  16: 23 */     this(paramaqu);
/*  17:    */     
/*  18: 25 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  19:    */     
/*  20: 27 */     float f = (float)(Math.random() * 3.141592741012573D * 2.0D);
/*  21: 28 */     this.v = (-(float)Math.sin(f) * 0.02F);
/*  22: 29 */     this.w = 0.2000000029802322D;
/*  23: 30 */     this.x = (-(float)Math.cos(f) * 0.02F);
/*  24:    */     
/*  25: 32 */     this.a = 80;
/*  26:    */     
/*  27: 34 */     this.p = paramDouble1;
/*  28: 35 */     this.q = paramDouble2;
/*  29: 36 */     this.r = paramDouble3;
/*  30: 37 */     this.b = paramxm;
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected void h() {}
/*  34:    */   
/*  35:    */   protected boolean r_()
/*  36:    */   {
/*  37: 46 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean ad()
/*  41:    */   {
/*  42: 51 */     return !this.I;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void s_()
/*  46:    */   {
/*  47: 56 */     this.p = this.s;
/*  48: 57 */     this.q = this.t;
/*  49: 58 */     this.r = this.u;
/*  50:    */     
/*  51: 60 */     this.w -= 0.03999999910593033D;
/*  52: 61 */     d(this.v, this.w, this.x);
/*  53: 62 */     this.v *= 0.9800000190734863D;
/*  54: 63 */     this.w *= 0.9800000190734863D;
/*  55: 64 */     this.x *= 0.9800000190734863D;
/*  56: 66 */     if (this.C)
/*  57:    */     {
/*  58: 67 */       this.v *= 0.699999988079071D;
/*  59: 68 */       this.x *= 0.699999988079071D;
/*  60: 69 */       this.w *= -0.5D;
/*  61:    */     }
/*  62: 72 */     if (this.a-- <= 0)
/*  63:    */     {
/*  64: 73 */       J();
/*  65: 74 */       if (!this.o.D) {
/*  66: 75 */         l();
/*  67:    */       }
/*  68:    */     }
/*  69:    */     else
/*  70:    */     {
/*  71: 78 */       W();
/*  72: 79 */       this.o.a(ew.l, this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   private void l()
/*  77:    */   {
/*  78: 84 */     float f = 4.0F;
/*  79: 85 */     this.o.a(this, this.s, this.t + this.K / 2.0F, this.u, f, true);
/*  80:    */   }
/*  81:    */   
/*  82:    */   protected void b(fn paramfn)
/*  83:    */   {
/*  84: 90 */     paramfn.a("Fuse", (byte)this.a);
/*  85:    */   }
/*  86:    */   
/*  87:    */   protected void a(fn paramfn)
/*  88:    */   {
/*  89: 95 */     this.a = paramfn.d("Fuse");
/*  90:    */   }
/*  91:    */   
/*  92:    */   public xm j()
/*  93:    */   {
/*  94: 99 */     return this.b;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public float aR()
/*  98:    */   {
/*  99:104 */     return 0.0F;
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aek
 * JD-Core Version:    0.7.0.1
 */