/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aem
/*   4:    */   extends afm
/*   5:    */ {
/*   6: 21 */   private float b = 0.5F;
/*   7:    */   private int c;
/*   8:    */   
/*   9:    */   public aem(aqu paramaqu)
/*  10:    */   {
/*  11: 27 */     super(paramaqu);
/*  12:    */     
/*  13: 29 */     this.ab = true;
/*  14: 30 */     this.b_ = 10;
/*  15:    */     
/*  16: 32 */     this.i.a(4, new aen(this));
/*  17: 33 */     this.i.a(5, new zo(this, 1.0D));
/*  18: 34 */     this.i.a(7, new zy(this, 1.0D));
/*  19: 35 */     this.i.a(8, new zh(this, ahd.class, 8.0F));
/*  20: 36 */     this.i.a(8, new zx(this));
/*  21:    */     
/*  22: 38 */     this.bg.a(1, new aal(this, true, new Class[0]));
/*  23: 39 */     this.bg.a(2, new aaq(this, ahd.class, true));
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void aW()
/*  27:    */   {
/*  28: 44 */     super.aW();
/*  29: 45 */     a(afs.e).a(6.0D);
/*  30: 46 */     a(afs.d).a(0.2300000041723251D);
/*  31: 47 */     a(afs.b).a(48.0D);
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void h()
/*  35:    */   {
/*  36: 52 */     super.h();
/*  37:    */     
/*  38: 54 */     this.ac.a(16, new Byte((byte)0));
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected String z()
/*  42:    */   {
/*  43: 59 */     return "mob.blaze.breathe";
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected String bn()
/*  47:    */   {
/*  48: 64 */     return "mob.blaze.hit";
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected String bo()
/*  52:    */   {
/*  53: 69 */     return "mob.blaze.death";
/*  54:    */   }
/*  55:    */   
/*  56:    */   public int b(float paramFloat)
/*  57:    */   {
/*  58: 74 */     return 15728880;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public float c(float paramFloat)
/*  62:    */   {
/*  63: 79 */     return 1.0F;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void m()
/*  67:    */   {
/*  68: 85 */     if ((!this.C) && (this.w < 0.0D)) {
/*  69: 86 */       this.w *= 0.6D;
/*  70:    */     }
/*  71: 89 */     if (this.o.D)
/*  72:    */     {
/*  73: 90 */       if ((this.V.nextInt(24) == 0) && (!R())) {
/*  74: 91 */         this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.fire", 1.0F + this.V.nextFloat(), this.V.nextFloat() * 0.7F + 0.3F, false);
/*  75:    */       }
/*  76: 93 */       for (int i = 0; i < 2; i++) {
/*  77: 94 */         this.o.a(ew.m, this.s + (this.V.nextDouble() - 0.5D) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5D) * this.J, 0.0D, 0.0D, 0.0D, new int[0]);
/*  78:    */       }
/*  79:    */     }
/*  80: 98 */     super.m();
/*  81:    */   }
/*  82:    */   
/*  83:    */   protected void E()
/*  84:    */   {
/*  85:103 */     if (U()) {
/*  86:104 */       a(wh.f, 1.0F);
/*  87:    */     }
/*  88:107 */     this.c -= 1;
/*  89:108 */     if (this.c <= 0)
/*  90:    */     {
/*  91:109 */       this.c = 100;
/*  92:110 */       this.b = (0.5F + (float)this.V.nextGaussian() * 3.0F);
/*  93:    */     }
/*  94:113 */     xm localxm = u();
/*  95:114 */     if ((localxm != null) && (localxm.t + localxm.aR() > this.t + aR() + this.b))
/*  96:    */     {
/*  97:115 */       this.w += (0.300000011920929D - this.w) * 0.300000011920929D;
/*  98:116 */       this.ai = true;
/*  99:    */     }
/* 100:119 */     super.E();
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void e(float paramFloat1, float paramFloat2) {}
/* 104:    */   
/* 105:    */   protected alq A()
/* 106:    */   {
/* 107:128 */     return amk.bv;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public boolean au()
/* 111:    */   {
/* 112:133 */     return n();
/* 113:    */   }
/* 114:    */   
/* 115:    */   protected void b(boolean paramBoolean, int paramInt)
/* 116:    */   {
/* 117:138 */     if (paramBoolean)
/* 118:    */     {
/* 119:139 */       int i = this.V.nextInt(2 + paramInt);
/* 120:140 */       for (int j = 0; j < i; j++) {
/* 121:141 */         a(amk.bv, 1);
/* 122:    */       }
/* 123:    */     }
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean n()
/* 127:    */   {
/* 128:147 */     return (this.ac.a(16) & 0x1) != 0;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void a(boolean paramBoolean)
/* 132:    */   {
/* 133:151 */     byte b1 = this.ac.a(16);
/* 134:152 */     if (paramBoolean) {
/* 135:153 */       b1 = (byte)(b1 | 0x1);
/* 136:    */     } else {
/* 137:155 */       b1 = (byte)(b1 & 0xFFFFFFFE);
/* 138:    */     }
/* 139:157 */     this.ac.b(16, Byte.valueOf(b1));
/* 140:    */   }
/* 141:    */   
/* 142:    */   protected boolean m_()
/* 143:    */   {
/* 144:162 */     return true;
/* 145:    */   }
/* 146:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aem
 * JD-Core Version:    0.7.0.1
 */