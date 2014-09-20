/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class afl
/*   5:    */   extends afy
/*   6:    */ {
/*   7:    */   public afl(aqu paramaqu)
/*   8:    */   {
/*   9: 11 */     super(paramaqu);
/*  10: 12 */     this.ab = true;
/*  11:    */   }
/*  12:    */   
/*  13:    */   protected void aW()
/*  14:    */   {
/*  15: 17 */     super.aW();
/*  16:    */     
/*  17: 19 */     a(afs.d).a(0.2000000029802322D);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean bQ()
/*  21:    */   {
/*  22: 24 */     return this.o.aa() != vt.a;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean bR()
/*  26:    */   {
/*  27: 29 */     return (this.o.a(aQ(), this)) && (this.o.a(this, aQ()).isEmpty()) && (!this.o.d(aQ()));
/*  28:    */   }
/*  29:    */   
/*  30:    */   public int bq()
/*  31:    */   {
/*  32: 34 */     return ck() * 3;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public int b(float paramFloat)
/*  36:    */   {
/*  37: 39 */     return 15728880;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public float c(float paramFloat)
/*  41:    */   {
/*  42: 44 */     return 1.0F;
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected ew n()
/*  46:    */   {
/*  47: 49 */     return ew.A;
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected afy cd()
/*  51:    */   {
/*  52: 54 */     return new afl(this.o);
/*  53:    */   }
/*  54:    */   
/*  55:    */   protected alq A()
/*  56:    */   {
/*  57: 59 */     return amk.bE;
/*  58:    */   }
/*  59:    */   
/*  60:    */   protected void b(boolean paramBoolean, int paramInt)
/*  61:    */   {
/*  62: 64 */     alq localalq = A();
/*  63: 65 */     if ((localalq != null) && (ck() > 1))
/*  64:    */     {
/*  65: 66 */       int i = this.V.nextInt(4) - 2;
/*  66: 67 */       if (paramInt > 0) {
/*  67: 68 */         i += this.V.nextInt(paramInt + 1);
/*  68:    */       }
/*  69: 70 */       for (int j = 0; j < i; j++) {
/*  70: 71 */         a(localalq, 1);
/*  71:    */       }
/*  72:    */     }
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean au()
/*  76:    */   {
/*  77: 78 */     return false;
/*  78:    */   }
/*  79:    */   
/*  80:    */   protected int ce()
/*  81:    */   {
/*  82: 83 */     return super.ce() * 4;
/*  83:    */   }
/*  84:    */   
/*  85:    */   protected void cf()
/*  86:    */   {
/*  87: 88 */     this.a *= 0.9F;
/*  88:    */   }
/*  89:    */   
/*  90:    */   protected void bE()
/*  91:    */   {
/*  92: 93 */     this.w = (0.42F + ck() * 0.1F);
/*  93: 94 */     this.ai = true;
/*  94:    */   }
/*  95:    */   
/*  96:    */   protected void bG()
/*  97:    */   {
/*  98: 99 */     this.w = (0.22F + ck() * 0.05F);
/*  99:100 */     this.ai = true;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void e(float paramFloat1, float paramFloat2) {}
/* 103:    */   
/* 104:    */   protected boolean cg()
/* 105:    */   {
/* 106:109 */     return true;
/* 107:    */   }
/* 108:    */   
/* 109:    */   protected int ch()
/* 110:    */   {
/* 111:114 */     return super.ch() + 2;
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected String ci()
/* 115:    */   {
/* 116:119 */     if (ck() > 1) {
/* 117:120 */       return "mob.magmacube.big";
/* 118:    */     }
/* 119:122 */     return "mob.magmacube.small";
/* 120:    */   }
/* 121:    */   
/* 122:    */   protected boolean cj()
/* 123:    */   {
/* 124:127 */     return true;
/* 125:    */   }
/* 126:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afl
 * JD-Core Version:    0.7.0.1
 */