/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class age
/*   4:    */   extends afm
/*   5:    */ {
/*   6:    */   public age(aqu paramaqu)
/*   7:    */   {
/*   8: 31 */     super(paramaqu);
/*   9: 32 */     a(1.4F, 0.9F);
/*  10:    */     
/*  11: 34 */     this.i.a(1, new yy(this));
/*  12:    */     
/*  13: 36 */     this.i.a(2, this.a);
/*  14: 37 */     this.i.a(3, new zg(this, 0.4F));
/*  15: 38 */     this.i.a(4, new agf(this, ahd.class));
/*  16: 39 */     this.i.a(4, new agf(this, acq.class));
/*  17:    */     
/*  18: 41 */     this.i.a(5, new zy(this, 0.8D));
/*  19: 42 */     this.i.a(6, new zh(this, ahd.class, 8.0F));
/*  20: 43 */     this.i.a(6, new zx(this));
/*  21:    */     
/*  22: 45 */     this.bg.a(1, new aal(this, false, new Class[0]));
/*  23: 46 */     this.bg.a(2, new agh(this, ahd.class));
/*  24: 47 */     this.bg.a(3, new agh(this, acq.class));
/*  25:    */   }
/*  26:    */   
/*  27:    */   protected aaz b(aqu paramaqu)
/*  28:    */   {
/*  29: 52 */     return new aba(this, paramaqu);
/*  30:    */   }
/*  31:    */   
/*  32:    */   protected void h()
/*  33:    */   {
/*  34: 57 */     super.h();
/*  35:    */     
/*  36: 59 */     this.ac.a(16, new Byte((byte)0));
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void s_()
/*  40:    */   {
/*  41: 64 */     super.s_();
/*  42: 66 */     if (!this.o.D) {
/*  43: 69 */       a(this.D);
/*  44:    */     }
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void aW()
/*  48:    */   {
/*  49: 75 */     super.aW();
/*  50:    */     
/*  51: 77 */     a(afs.a).a(16.0D);
/*  52: 78 */     a(afs.d).a(0.300000011920929D);
/*  53:    */   }
/*  54:    */   
/*  55:    */   protected String z()
/*  56:    */   {
/*  57: 83 */     return "mob.spider.say";
/*  58:    */   }
/*  59:    */   
/*  60:    */   protected String bn()
/*  61:    */   {
/*  62: 88 */     return "mob.spider.say";
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected String bo()
/*  66:    */   {
/*  67: 93 */     return "mob.spider.death";
/*  68:    */   }
/*  69:    */   
/*  70:    */   protected void a(dt paramdt, atr paramatr)
/*  71:    */   {
/*  72: 98 */     a("mob.spider.step", 0.15F, 1.0F);
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected alq A()
/*  76:    */   {
/*  77:103 */     return amk.F;
/*  78:    */   }
/*  79:    */   
/*  80:    */   protected void b(boolean paramBoolean, int paramInt)
/*  81:    */   {
/*  82:108 */     super.b(paramBoolean, paramInt);
/*  83:110 */     if ((paramBoolean) && ((this.V.nextInt(3) == 0) || (this.V.nextInt(1 + paramInt) > 0))) {
/*  84:111 */       a(amk.bB, 1);
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   public boolean j_()
/*  89:    */   {
/*  90:121 */     return n();
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void aB() {}
/*  94:    */   
/*  95:    */   public xs by()
/*  96:    */   {
/*  97:131 */     return xs.c;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public boolean d(wq paramwq)
/* 101:    */   {
/* 102:136 */     if (paramwq.a() == wp.u.H) {
/* 103:137 */       return false;
/* 104:    */     }
/* 105:139 */     return super.d(paramwq);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean n()
/* 109:    */   {
/* 110:143 */     return (this.ac.a(16) & 0x1) != 0;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void a(boolean paramBoolean)
/* 114:    */   {
/* 115:147 */     byte b = this.ac.a(16);
/* 116:148 */     if (paramBoolean) {
/* 117:149 */       b = (byte)(b | 0x1);
/* 118:    */     } else {
/* 119:151 */       b = (byte)(b & 0xFFFFFFFE);
/* 120:    */     }
/* 121:153 */     this.ac.b(16, Byte.valueOf(b));
/* 122:    */   }
/* 123:    */   
/* 124:    */   public xq a(vu paramvu, xq paramxq)
/* 125:    */   {
/* 126:159 */     paramxq = super.a(paramvu, paramxq);
/* 127:161 */     if (this.o.s.nextInt(100) == 0)
/* 128:    */     {
/* 129:162 */       afw localafw = new afw(this.o);
/* 130:163 */       localafw.b(this.s, this.t, this.u, this.y, 0.0F);
/* 131:164 */       localafw.a(paramvu, null);
/* 132:165 */       this.o.d(localafw);
/* 133:166 */       localafw.a(this);
/* 134:    */     }
/* 135:169 */     if (paramxq == null)
/* 136:    */     {
/* 137:170 */       paramxq = new agg();
/* 138:172 */       if ((this.o.aa() == vt.d) && (this.o.s.nextFloat() < 0.1F * paramvu.c())) {
/* 139:173 */         ((agg)paramxq).a(this.o.s);
/* 140:    */       }
/* 141:    */     }
/* 142:176 */     if ((paramxq instanceof agg))
/* 143:    */     {
/* 144:177 */       int i = ((agg)paramxq).a;
/* 145:178 */       if ((i > 0) && (wp.a[i] != null)) {
/* 146:179 */         c(new wq(i, 2147483647));
/* 147:    */       }
/* 148:    */     }
/* 149:183 */     return paramxq;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public float aR()
/* 153:    */   {
/* 154:188 */     return 0.65F;
/* 155:    */   }
/* 156:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     age
 * JD-Core Version:    0.7.0.1
 */