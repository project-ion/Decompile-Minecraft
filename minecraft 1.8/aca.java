/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aca
/*   4:    */   extends abq
/*   5:    */ {
/*   6:    */   private final yu bk;
/*   7:    */   
/*   8:    */   public aca(aqu paramaqu)
/*   9:    */   {
/*  10: 24 */     super(paramaqu);
/*  11: 25 */     a(0.9F, 0.9F);
/*  12:    */     
/*  13: 27 */     ((aay)s()).a(true);
/*  14: 28 */     this.i.a(0, new yy(this));
/*  15: 29 */     this.i.a(1, new zu(this, 1.25D));
/*  16: 30 */     this.i.a(2, this.bk = new yu(this, 0.3F));
/*  17: 31 */     this.i.a(3, new yt(this, 1.0D));
/*  18: 32 */     this.i.a(4, new aag(this, 1.2D, amk.bY, false));
/*  19: 33 */     this.i.a(4, new aag(this, 1.2D, amk.bR, false));
/*  20: 34 */     this.i.a(5, new za(this, 1.1D));
/*  21: 35 */     this.i.a(6, new zy(this, 1.0D));
/*  22: 36 */     this.i.a(7, new zh(this, ahd.class, 6.0F));
/*  23: 37 */     this.i.a(8, new zx(this));
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void aW()
/*  27:    */   {
/*  28: 42 */     super.aW();
/*  29:    */     
/*  30: 44 */     a(afs.a).a(10.0D);
/*  31: 45 */     a(afs.d).a(0.25D);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public boolean bV()
/*  35:    */   {
/*  36: 50 */     amj localamj = ((ahd)this.l).bz();
/*  37:    */     
/*  38: 52 */     return (localamj != null) && (localamj.b() == amk.bY);
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected void h()
/*  42:    */   {
/*  43: 57 */     super.h();
/*  44: 58 */     this.ac.a(16, Byte.valueOf((byte)0));
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void b(fn paramfn)
/*  48:    */   {
/*  49: 63 */     super.b(paramfn);
/*  50: 64 */     paramfn.a("Saddle", cj());
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void a(fn paramfn)
/*  54:    */   {
/*  55: 69 */     super.a(paramfn);
/*  56: 70 */     l(paramfn.n("Saddle"));
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected String z()
/*  60:    */   {
/*  61: 75 */     return "mob.pig.say";
/*  62:    */   }
/*  63:    */   
/*  64:    */   protected String bn()
/*  65:    */   {
/*  66: 80 */     return "mob.pig.say";
/*  67:    */   }
/*  68:    */   
/*  69:    */   protected String bo()
/*  70:    */   {
/*  71: 85 */     return "mob.pig.death";
/*  72:    */   }
/*  73:    */   
/*  74:    */   protected void a(dt paramdt, atr paramatr)
/*  75:    */   {
/*  76: 90 */     a("mob.pig.step", 0.15F, 1.0F);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public boolean a(ahd paramahd)
/*  80:    */   {
/*  81: 95 */     if (!super.a(paramahd))
/*  82:    */     {
/*  83: 96 */       if ((cj()) && (!this.o.D) && ((this.l == null) || (this.l == paramahd)))
/*  84:    */       {
/*  85: 97 */         paramahd.a(this);
/*  86: 98 */         return true;
/*  87:    */       }
/*  88:100 */       return false;
/*  89:    */     }
/*  90:102 */     return true;
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected alq A()
/*  94:    */   {
/*  95:107 */     if (au()) {
/*  96:108 */       return amk.am;
/*  97:    */     }
/*  98:110 */     return amk.al;
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected void b(boolean paramBoolean, int paramInt)
/* 102:    */   {
/* 103:115 */     int i = this.V.nextInt(3) + 1 + this.V.nextInt(1 + paramInt);
/* 104:117 */     for (int j = 0; j < i; j++) {
/* 105:118 */       if (au()) {
/* 106:119 */         a(amk.am, 1);
/* 107:    */       } else {
/* 108:121 */         a(amk.al, 1);
/* 109:    */       }
/* 110:    */     }
/* 111:125 */     if (cj()) {
/* 112:126 */       a(amk.aA, 1);
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public boolean cj()
/* 117:    */   {
/* 118:131 */     return (this.ac.a(16) & 0x1) != 0;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void l(boolean paramBoolean)
/* 122:    */   {
/* 123:135 */     if (paramBoolean) {
/* 124:136 */       this.ac.b(16, Byte.valueOf((byte)1));
/* 125:    */     } else {
/* 126:138 */       this.ac.b(16, Byte.valueOf((byte)0));
/* 127:    */     }
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void a(ads paramads)
/* 131:    */   {
/* 132:144 */     if (this.o.D) {
/* 133:145 */       return;
/* 134:    */     }
/* 135:148 */     afo localafo = new afo(this.o);
/* 136:149 */     localafo.c(0, new amj(amk.B));
/* 137:150 */     localafo.b(this.s, this.t, this.u, this.y, this.z);
/* 138:151 */     this.o.d(localafo);
/* 139:152 */     J();
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void e(float paramFloat1, float paramFloat2)
/* 143:    */   {
/* 144:157 */     super.e(paramFloat1, paramFloat2);
/* 145:159 */     if ((paramFloat1 > 5.0F) && ((this.l instanceof ahd))) {
/* 146:160 */       ((ahd)this.l).b(tl.u);
/* 147:    */     }
/* 148:    */   }
/* 149:    */   
/* 150:    */   public aca b(ws paramws)
/* 151:    */   {
/* 152:166 */     return new aca(this.o);
/* 153:    */   }
/* 154:    */   
/* 155:    */   public boolean d(amj paramamj)
/* 156:    */   {
/* 157:171 */     return (paramamj != null) && (paramamj.b() == amk.bR);
/* 158:    */   }
/* 159:    */   
/* 160:    */   public yu ck()
/* 161:    */   {
/* 162:175 */     return this.bk;
/* 163:    */   }
/* 164:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aca
 * JD-Core Version:    0.7.0.1
 */