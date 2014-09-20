/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ import java.util.UUID;
/*   4:    */ 
/*   5:    */ public class afo
/*   6:    */   extends agj
/*   7:    */ {
/*   8: 25 */   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
/*   9: 26 */   private static final ya bk = new ya(c, "Attacking speed boost", 0.05D, 0).a(false);
/*  10:    */   private int bl;
/*  11:    */   private int bm;
/*  12:    */   private UUID bn;
/*  13:    */   
/*  14:    */   public afo(aqu paramaqu)
/*  15:    */   {
/*  16: 34 */     super(paramaqu);
/*  17: 35 */     this.ab = true;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void b(xm paramxm)
/*  21:    */   {
/*  22: 40 */     super.b(paramxm);
/*  23: 41 */     if (paramxm != null) {
/*  24: 42 */       this.bn = paramxm.aJ();
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected void n()
/*  29:    */   {
/*  30: 48 */     this.bg.a(1, new afq(this));
/*  31: 49 */     this.bg.a(2, new afp(this));
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void aW()
/*  35:    */   {
/*  36: 54 */     super.aW();
/*  37:    */     
/*  38: 56 */     a(b).a(0.0D);
/*  39: 57 */     a(afs.d).a(0.2300000041723251D);
/*  40: 58 */     a(afs.e).a(5.0D);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void s_()
/*  44:    */   {
/*  45: 63 */     super.s_();
/*  46:    */   }
/*  47:    */   
/*  48:    */   protected void E()
/*  49:    */   {
/*  50: 68 */     xz localxz = a(afs.d);
/*  51: 69 */     if (ck())
/*  52:    */     {
/*  53: 70 */       if ((!i_()) && (!localxz.a(bk))) {
/*  54: 71 */         localxz.b(bk);
/*  55:    */       }
/*  56: 73 */       this.bl -= 1;
/*  57:    */     }
/*  58: 74 */     else if (localxz.a(bk))
/*  59:    */     {
/*  60: 75 */       localxz.c(bk);
/*  61:    */     }
/*  62: 78 */     if ((this.bm > 0) && 
/*  63: 79 */       (--this.bm == 0)) {
/*  64: 80 */       a("mob.zombiepig.zpigangry", bA() * 2.0F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F) * 1.8F);
/*  65:    */     }
/*  66: 84 */     if ((this.bl > 0) && 
/*  67: 85 */       (this.bn != null) && (bc() == null))
/*  68:    */     {
/*  69: 86 */       ahd localahd = this.o.b(this.bn);
/*  70: 87 */       b(localahd);
/*  71: 88 */       this.aL = localahd;
/*  72: 89 */       this.aM = bd();
/*  73:    */     }
/*  74: 93 */     super.E();
/*  75:    */   }
/*  76:    */   
/*  77:    */   public boolean bQ()
/*  78:    */   {
/*  79: 98 */     return this.o.aa() != vt.a;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean bR()
/*  83:    */   {
/*  84:103 */     return (this.o.a(aQ(), this)) && (this.o.a(this, aQ()).isEmpty()) && (!this.o.d(aQ()));
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void b(fn paramfn)
/*  88:    */   {
/*  89:108 */     super.b(paramfn);
/*  90:109 */     paramfn.a("Anger", (short)this.bl);
/*  91:110 */     if (this.bn != null) {
/*  92:111 */       paramfn.a("HurtBy", this.bn.toString());
/*  93:    */     } else {
/*  94:113 */       paramfn.a("HurtBy", "");
/*  95:    */     }
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(fn paramfn)
/*  99:    */   {
/* 100:119 */     super.a(paramfn);
/* 101:120 */     this.bl = paramfn.e("Anger");
/* 102:121 */     String str = paramfn.j("HurtBy");
/* 103:122 */     if (str.length() > 0)
/* 104:    */     {
/* 105:123 */       this.bn = UUID.fromString(str);
/* 106:    */       
/* 107:125 */       ahd localahd = this.o.b(this.bn);
/* 108:126 */       b(localahd);
/* 109:127 */       if (localahd != null)
/* 110:    */       {
/* 111:128 */         this.aL = localahd;
/* 112:129 */         this.aM = bd();
/* 113:    */       }
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   public boolean a(wh paramwh, float paramFloat)
/* 118:    */   {
/* 119:136 */     if (b(paramwh)) {
/* 120:137 */       return false;
/* 121:    */     }
/* 122:139 */     wv localwv = paramwh.j();
/* 123:140 */     if ((localwv instanceof ahd)) {
/* 124:141 */       b(localwv);
/* 125:    */     }
/* 126:143 */     return super.a(paramwh, paramFloat);
/* 127:    */   }
/* 128:    */   
/* 129:    */   private void b(wv paramwv)
/* 130:    */   {
/* 131:147 */     this.bl = (400 + this.V.nextInt(400));
/* 132:148 */     this.bm = this.V.nextInt(40);
/* 133:149 */     if ((paramwv instanceof xm)) {
/* 134:150 */       b((xm)paramwv);
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public boolean ck()
/* 139:    */   {
/* 140:155 */     return this.bl > 0;
/* 141:    */   }
/* 142:    */   
/* 143:    */   protected String z()
/* 144:    */   {
/* 145:160 */     return "mob.zombiepig.zpig";
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected String bn()
/* 149:    */   {
/* 150:165 */     return "mob.zombiepig.zpighurt";
/* 151:    */   }
/* 152:    */   
/* 153:    */   protected String bo()
/* 154:    */   {
/* 155:170 */     return "mob.zombiepig.zpigdeath";
/* 156:    */   }
/* 157:    */   
/* 158:    */   protected void b(boolean paramBoolean, int paramInt)
/* 159:    */   {
/* 160:175 */     int i = this.V.nextInt(2 + paramInt);
/* 161:176 */     for (int j = 0; j < i; j++) {
/* 162:177 */       a(amk.bt, 1);
/* 163:    */     }
/* 164:179 */     i = this.V.nextInt(2 + paramInt);
/* 165:180 */     for (j = 0; j < i; j++) {
/* 166:181 */       a(amk.bx, 1);
/* 167:    */     }
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean a(ahd paramahd)
/* 171:    */   {
/* 172:187 */     return false;
/* 173:    */   }
/* 174:    */   
/* 175:    */   protected void bp()
/* 176:    */   {
/* 177:192 */     a(amk.k, 1);
/* 178:    */   }
/* 179:    */   
/* 180:    */   protected void a(vu paramvu)
/* 181:    */   {
/* 182:197 */     c(0, new amj(amk.B));
/* 183:    */   }
/* 184:    */   
/* 185:    */   public xq a(vu paramvu, xq paramxq)
/* 186:    */   {
/* 187:203 */     super.a(paramvu, paramxq);
/* 188:204 */     m(false);
/* 189:205 */     return paramxq;
/* 190:    */   }
/* 191:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afo
 * JD-Core Version:    0.7.0.1
 */