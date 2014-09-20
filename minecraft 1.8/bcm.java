/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public abstract class bcm
/*   7:    */ {
/*   8: 21 */   private static final Logger a = ;
/*   9: 22 */   private static Map f = Maps.newHashMap();
/*  10: 23 */   private static Map g = Maps.newHashMap();
/*  11:    */   protected aqu b;
/*  12:    */   
/*  13:    */   private static void a(Class paramClass, String paramString)
/*  14:    */   {
/*  15: 26 */     if (f.containsKey(paramString)) {
/*  16: 27 */       throw new IllegalArgumentException("Duplicate id: " + paramString);
/*  17:    */     }
/*  18: 29 */     f.put(paramString, paramClass);
/*  19: 30 */     g.put(paramClass, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   static
/*  23:    */   {
/*  24: 34 */     a(bdc.class, "Furnace");
/*  25: 35 */     a(bcr.class, "Chest");
/*  26: 36 */     a(bda.class, "EnderChest");
/*  27: 37 */     a(axd.class, "RecordPlayer");
/*  28: 38 */     a(bcx.class, "Trap");
/*  29: 39 */     a(bcy.class, "Dropper");
/*  30: 40 */     a(bdj.class, "Sign");
/*  31: 41 */     a(bdg.class, "MobSpawner");
/*  32: 42 */     a(bdi.class, "Music");
/*  33: 43 */     a(bdv.class, "Piston");
/*  34: 44 */     a(bcq.class, "Cauldron");
/*  35: 45 */     a(bcz.class, "EnchantTable");
/*  36: 46 */     a(bdn.class, "Airportal");
/*  37: 47 */     a(bct.class, "Control");
/*  38: 48 */     a(bck.class, "Beacon");
/*  39: 49 */     a(bdm.class, "Skull");
/*  40: 50 */     a(bcw.class, "DLDetector");
/*  41: 51 */     a(bde.class, "Hopper");
/*  42: 52 */     a(bcv.class, "Comparator");
/*  43: 53 */     a(bdb.class, "FlowerPot");
/*  44: 54 */     a(bci.class, "Banner");
/*  45:    */   }
/*  46:    */   
/*  47: 58 */   protected dt c = dt.a;
/*  48:    */   protected boolean d;
/*  49: 61 */   private int h = -1;
/*  50:    */   protected atr e;
/*  51:    */   
/*  52:    */   public aqu z()
/*  53:    */   {
/*  54: 65 */     return this.b;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void a(aqu paramaqu)
/*  58:    */   {
/*  59: 69 */     this.b = paramaqu;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean t()
/*  63:    */   {
/*  64: 73 */     return this.b != null;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void a(fn paramfn)
/*  68:    */   {
/*  69: 77 */     this.c = new dt(paramfn.f("x"), paramfn.f("y"), paramfn.f("z"));
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void b(fn paramfn)
/*  73:    */   {
/*  74: 81 */     String str = (String)g.get(getClass());
/*  75: 82 */     if (str == null) {
/*  76: 83 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*  77:    */     }
/*  78: 85 */     paramfn.a("id", str);
/*  79: 86 */     paramfn.a("x", this.c.n());
/*  80: 87 */     paramfn.a("y", this.c.o());
/*  81: 88 */     paramfn.a("z", this.c.p());
/*  82:    */   }
/*  83:    */   
/*  84:    */   public static bcm c(fn paramfn)
/*  85:    */   {
/*  86: 92 */     bcm localbcm = null;
/*  87:    */     try
/*  88:    */     {
/*  89: 94 */       Class localClass = (Class)f.get(paramfn.j("id"));
/*  90: 95 */       if (localClass != null) {
/*  91: 96 */         localbcm = (bcm)localClass.newInstance();
/*  92:    */       }
/*  93:    */     }
/*  94:    */     catch (Exception localException)
/*  95:    */     {
/*  96: 99 */       localException.printStackTrace();
/*  97:    */     }
/*  98:101 */     if (localbcm != null) {
/*  99:102 */       localbcm.a(paramfn);
/* 100:    */     } else {
/* 101:104 */       a.warn("Skipping BlockEntity with id " + paramfn.j("id"));
/* 102:    */     }
/* 103:106 */     return localbcm;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public int u()
/* 107:    */   {
/* 108:110 */     if (this.h == -1)
/* 109:    */     {
/* 110:111 */       bec localbec = this.b.p(this.c);
/* 111:112 */       this.h = localbec.c().c(localbec);
/* 112:    */     }
/* 113:114 */     return this.h;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void o_()
/* 117:    */   {
/* 118:122 */     if (this.b != null)
/* 119:    */     {
/* 120:123 */       bec localbec = this.b.p(this.c);
/* 121:124 */       this.h = localbec.c().c(localbec);
/* 122:125 */       this.b.b(this.c, this);
/* 123:127 */       if (w() != aty.a) {
/* 124:128 */         this.b.e(this.c, w());
/* 125:    */       }
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public double a(double paramDouble1, double paramDouble2, double paramDouble3)
/* 130:    */   {
/* 131:134 */     double d1 = this.c.n() + 0.5D - paramDouble1;
/* 132:135 */     double d2 = this.c.o() + 0.5D - paramDouble2;
/* 133:136 */     double d3 = this.c.p() + 0.5D - paramDouble3;
/* 134:137 */     return d1 * d1 + d2 * d2 + d3 * d3;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public double s()
/* 138:    */   {
/* 139:141 */     return 4096.0D;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public dt v()
/* 143:    */   {
/* 144:145 */     return this.c;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public atr w()
/* 148:    */   {
/* 149:151 */     if (this.e == null) {
/* 150:152 */       this.e = this.b.p(this.c).c();
/* 151:    */     }
/* 152:154 */     return this.e;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public id x_()
/* 156:    */   {
/* 157:158 */     return null;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean x()
/* 161:    */   {
/* 162:162 */     return this.d;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void y()
/* 166:    */   {
/* 167:166 */     this.d = true;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void D()
/* 171:    */   {
/* 172:170 */     this.d = false;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public boolean c(int paramInt1, int paramInt2)
/* 176:    */   {
/* 177:174 */     return false;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void E()
/* 181:    */   {
/* 182:178 */     this.e = null;
/* 183:179 */     this.h = -1;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void a(j paramj)
/* 187:    */   {
/* 188:183 */     paramj.a("Name", new bcn(this));
/* 189:190 */     if (this.b == null) {
/* 190:191 */       return;
/* 191:    */     }
/* 192:194 */     j.a(paramj, this.c, w(), u());
/* 193:    */     
/* 194:196 */     paramj.a("Actual block type", new bco(this));
/* 195:    */     
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:    */ 
/* 201:    */ 
/* 202:    */ 
/* 203:    */ 
/* 204:    */ 
/* 205:    */ 
/* 206:208 */     paramj.a("Actual block data value", new bcp(this));
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void a(dt paramdt)
/* 210:    */   {
/* 211:225 */     this.c = paramdt;
/* 212:    */   }
/* 213:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bcm
 * JD-Core Version:    0.7.0.1
 */