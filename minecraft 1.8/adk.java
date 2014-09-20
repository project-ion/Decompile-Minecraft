/*   1:    */ import java.util.Map;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class adk
/*   5:    */   extends adj
/*   6:    */ {
/*   7: 25 */   private float c = 1.0F;
/*   8:    */   
/*   9:    */   public adk(aqu paramaqu)
/*  10:    */   {
/*  11: 28 */     super(paramaqu);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public adk(aqu paramaqu, dt paramdt, ej paramej)
/*  15:    */   {
/*  16: 32 */     super(paramaqu, paramdt);
/*  17: 33 */     a(paramej);
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected void h()
/*  21:    */   {
/*  22: 38 */     H().a(8, 5);
/*  23: 39 */     H().a(9, Byte.valueOf((byte)0));
/*  24:    */   }
/*  25:    */   
/*  26:    */   public float ao()
/*  27:    */   {
/*  28: 44 */     return 0.0F;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean a(wh paramwh, float paramFloat)
/*  32:    */   {
/*  33: 49 */     if (b(paramwh)) {
/*  34: 50 */       return false;
/*  35:    */     }
/*  36: 53 */     if ((!paramwh.c()) && (o() != null))
/*  37:    */     {
/*  38: 54 */       if (!this.o.D)
/*  39:    */       {
/*  40: 55 */         a(paramwh.j(), false);
/*  41: 56 */         a(null);
/*  42:    */       }
/*  43: 58 */       return true;
/*  44:    */     }
/*  45: 60 */     return super.a(paramwh, paramFloat);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public int l()
/*  49:    */   {
/*  50: 66 */     return 12;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public int m()
/*  54:    */   {
/*  55: 71 */     return 12;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public boolean a(double paramDouble)
/*  59:    */   {
/*  60: 76 */     double d = 16.0D;
/*  61: 77 */     d *= 64.0D * this.j;
/*  62: 78 */     return paramDouble < d * d;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void b(wv paramwv)
/*  66:    */   {
/*  67: 83 */     a(paramwv, true);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(wv paramwv, boolean paramBoolean)
/*  71:    */   {
/*  72: 87 */     if (!this.o.Q().b("doTileDrops")) {
/*  73: 88 */       return;
/*  74:    */     }
/*  75: 91 */     amj localamj = o();
/*  76: 93 */     if ((paramwv instanceof ahd))
/*  77:    */     {
/*  78: 94 */       ahd localahd = (ahd)paramwv;
/*  79: 96 */       if (localahd.by.d)
/*  80:    */       {
/*  81: 97 */         b(localamj);
/*  82: 98 */         return;
/*  83:    */       }
/*  84:    */     }
/*  85:102 */     if (paramBoolean) {
/*  86:103 */       a(new amj(amk.bP), 0.0F);
/*  87:    */     }
/*  88:105 */     if ((localamj != null) && (this.V.nextFloat() < this.c))
/*  89:    */     {
/*  90:106 */       localamj = localamj.k();
/*  91:107 */       b(localamj);
/*  92:108 */       a(localamj, 0.0F);
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   private void b(amj paramamj)
/*  97:    */   {
/*  98:113 */     if (paramamj == null) {
/*  99:114 */       return;
/* 100:    */     }
/* 101:116 */     if (paramamj.b() == amk.bd)
/* 102:    */     {
/* 103:117 */       bqe localbqe = ((amn)paramamj.b()).a(paramamj, this.o);
/* 104:118 */       localbqe.h.remove("frame-" + F());
/* 105:    */     }
/* 106:120 */     paramamj.a(null);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public amj o()
/* 110:    */   {
/* 111:124 */     return H().f(8);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void a(amj paramamj)
/* 115:    */   {
/* 116:128 */     a(paramamj, true);
/* 117:    */   }
/* 118:    */   
/* 119:    */   private void a(amj paramamj, boolean paramBoolean)
/* 120:    */   {
/* 121:132 */     if (paramamj != null)
/* 122:    */     {
/* 123:133 */       paramamj = paramamj.k();
/* 124:134 */       paramamj.b = 1;
/* 125:135 */       paramamj.a(this);
/* 126:    */     }
/* 127:137 */     H().b(8, paramamj);
/* 128:138 */     H().i(8);
/* 129:140 */     if ((paramBoolean) && (this.a != null)) {
/* 130:141 */       this.o.e(this.a, aty.a);
/* 131:    */     }
/* 132:    */   }
/* 133:    */   
/* 134:    */   public int p()
/* 135:    */   {
/* 136:146 */     return H().a(9);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void a(int paramInt)
/* 140:    */   {
/* 141:150 */     a(paramInt, true);
/* 142:    */   }
/* 143:    */   
/* 144:    */   private void a(int paramInt, boolean paramBoolean)
/* 145:    */   {
/* 146:154 */     H().b(9, Byte.valueOf((byte)(paramInt % 8)));
/* 147:156 */     if ((paramBoolean) && (this.a != null)) {
/* 148:157 */       this.o.e(this.a, aty.a);
/* 149:    */     }
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void b(fn paramfn)
/* 153:    */   {
/* 154:163 */     if (o() != null)
/* 155:    */     {
/* 156:164 */       paramfn.a("Item", o().b(new fn()));
/* 157:165 */       paramfn.a("ItemRotation", (byte)p());
/* 158:166 */       paramfn.a("ItemDropChance", this.c);
/* 159:    */     }
/* 160:168 */     super.b(paramfn);
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void a(fn paramfn)
/* 164:    */   {
/* 165:173 */     fn localfn = paramfn.m("Item");
/* 166:174 */     if ((localfn != null) && (!localfn.c_()))
/* 167:    */     {
/* 168:175 */       a(amj.a(localfn), false);
/* 169:176 */       a(paramfn.d("ItemRotation"), false);
/* 170:178 */       if (paramfn.b("ItemDropChance", 99)) {
/* 171:179 */         this.c = paramfn.h("ItemDropChance");
/* 172:    */       }
/* 173:182 */       if (paramfn.c("Direction")) {
/* 174:184 */         a(p() * 2, false);
/* 175:    */       }
/* 176:    */     }
/* 177:187 */     super.a(paramfn);
/* 178:    */   }
/* 179:    */   
/* 180:    */   public boolean e(ahd paramahd)
/* 181:    */   {
/* 182:192 */     if (o() == null)
/* 183:    */     {
/* 184:193 */       amj localamj = paramahd.bz();
/* 185:194 */       if ((localamj != null) && 
/* 186:195 */         (!this.o.D))
/* 187:    */       {
/* 188:196 */         a(localamj);
/* 189:198 */         if (!paramahd.by.d) {
/* 190:199 */           if (--localamj.b <= 0) {
/* 191:200 */             paramahd.bg.a(paramahd.bg.c, null);
/* 192:    */           }
/* 193:    */         }
/* 194:    */       }
/* 195:    */     }
/* 196:206 */     else if (!this.o.D)
/* 197:    */     {
/* 198:207 */       a(p() + 1);
/* 199:    */     }
/* 200:211 */     return true;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public int q()
/* 204:    */   {
/* 205:215 */     if (o() == null) {
/* 206:216 */       return 0;
/* 207:    */     }
/* 208:219 */     return p() % 8 + 1;
/* 209:    */   }
/* 210:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adk
 * JD-Core Version:    0.7.0.1
 */