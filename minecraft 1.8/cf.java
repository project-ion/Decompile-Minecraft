/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Map;
/*   4:    */ import net.minecraft.server.MinecraftServer;
/*   5:    */ 
/*   6:    */ public class cf
/*   7:    */   extends z
/*   8:    */ {
/*   9: 32 */   private static final Map a = ;
/*  10:    */   
/*  11:    */   static
/*  12:    */   {
/*  13: 34 */     for (int i = 0; i < 54; i++) {
/*  14: 35 */       a.put("slot.container." + i, Integer.valueOf(i));
/*  15:    */     }
/*  16: 37 */     for (i = 0; i < 9; i++) {
/*  17: 38 */       a.put("slot.hotbar." + i, Integer.valueOf(i));
/*  18:    */     }
/*  19: 40 */     for (i = 0; i < 27; i++) {
/*  20: 41 */       a.put("slot.inventory." + i, Integer.valueOf(9 + i));
/*  21:    */     }
/*  22: 43 */     for (i = 0; i < 27; i++) {
/*  23: 44 */       a.put("slot.enderchest." + i, Integer.valueOf(200 + i));
/*  24:    */     }
/*  25: 46 */     for (i = 0; i < 8; i++) {
/*  26: 47 */       a.put("slot.villager." + i, Integer.valueOf(300 + i));
/*  27:    */     }
/*  28: 49 */     for (i = 0; i < 15; i++) {
/*  29: 50 */       a.put("slot.horse." + i, Integer.valueOf(500 + i));
/*  30:    */     }
/*  31: 52 */     a.put("slot.weapon", Integer.valueOf(99));
/*  32: 53 */     a.put("slot.armor.head", Integer.valueOf(103));
/*  33: 54 */     a.put("slot.armor.chest", Integer.valueOf(102));
/*  34: 55 */     a.put("slot.armor.legs", Integer.valueOf(101));
/*  35: 56 */     a.put("slot.armor.feet", Integer.valueOf(100));
/*  36: 57 */     a.put("slot.horse.saddle", Integer.valueOf(400));
/*  37: 58 */     a.put("slot.horse.armor", Integer.valueOf(401));
/*  38: 59 */     a.put("slot.horse.chest", Integer.valueOf(499));
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String c()
/*  42:    */   {
/*  43: 64 */     return "replaceitem";
/*  44:    */   }
/*  45:    */   
/*  46:    */   public int a()
/*  47:    */   {
/*  48: 69 */     return 2;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String c(ae paramae)
/*  52:    */   {
/*  53: 74 */     return "commands.replaceitem.usage";
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  57:    */   {
/*  58: 79 */     if (paramArrayOfString.length < 1) {
/*  59: 80 */       throw new dp("commands.replaceitem.usage", new Object[0]);
/*  60:    */     }
/*  61:    */     int i;
/*  62: 84 */     if (paramArrayOfString[0].equals("entity")) {
/*  63: 85 */       i = 0;
/*  64: 86 */     } else if (paramArrayOfString[0].equals("block")) {
/*  65: 87 */       i = 1;
/*  66:    */     } else {
/*  67: 89 */       throw new dp("commands.replaceitem.usage", new Object[0]);
/*  68:    */     }
/*  69:    */     int j;
/*  70: 93 */     if (i != 0)
/*  71:    */     {
/*  72: 94 */       if (paramArrayOfString.length < 6) {
/*  73: 95 */         throw new dp("commands.replaceitem.block.usage", new Object[0]);
/*  74:    */       }
/*  75: 97 */       j = 4;
/*  76:    */     }
/*  77:    */     else
/*  78:    */     {
/*  79: 99 */       if (paramArrayOfString.length < 4) {
/*  80:100 */         throw new dp("commands.replaceitem.entity.usage", new Object[0]);
/*  81:    */       }
/*  82:102 */       j = 2;
/*  83:    */     }
/*  84:105 */     int k = e(paramArrayOfString[(j++)]);
/*  85:    */     alq localalq;
/*  86:    */     try
/*  87:    */     {
/*  88:108 */       localalq = f(paramae, paramArrayOfString[j]);
/*  89:    */     }
/*  90:    */     catch (dk localdk)
/*  91:    */     {
/*  92:110 */       if (atr.b(paramArrayOfString[j]) == aty.a) {
/*  93:111 */         localalq = null;
/*  94:    */       } else {
/*  95:113 */         throw localdk;
/*  96:    */       }
/*  97:    */     }
/*  98:116 */     j++;
/*  99:    */     
/* 100:118 */     int m = paramArrayOfString.length > j ? a(paramArrayOfString[(j++)], 1, 64) : 1;
/* 101:119 */     int n = paramArrayOfString.length > j ? a(paramArrayOfString[(j++)]) : 0;
/* 102:120 */     amj localamj = new amj(localalq, m, n);
/* 103:    */     Object localObject;
/* 104:121 */     if (paramArrayOfString.length > j)
/* 105:    */     {
/* 106:122 */       localObject = a(paramae, paramArrayOfString, j).c();
/* 107:    */       try
/* 108:    */       {
/* 109:124 */         localamj.d(gg.a((String)localObject));
/* 110:    */       }
/* 111:    */       catch (gf localgf)
/* 112:    */       {
/* 113:126 */         throw new di("commands.replaceitem.tagError", new Object[] { localgf.getMessage() });
/* 114:    */       }
/* 115:    */     }
/* 116:130 */     if (localamj.b() == null) {
/* 117:131 */       localamj = null;
/* 118:    */     }
/* 119:134 */     if (i != 0)
/* 120:    */     {
/* 121:135 */       paramae.a(ag.d, 0);
/* 122:136 */       localObject = a(paramae, paramArrayOfString, 1, false);
/* 123:137 */       aqu localaqu = paramae.e();
/* 124:138 */       bcm localbcm = localaqu.s((dt)localObject);
/* 125:139 */       if ((localbcm == null) || (!(localbcm instanceof vq))) {
/* 126:140 */         throw new di("commands.replaceitem.noContainer", new Object[] { Integer.valueOf(((dt)localObject).n()), Integer.valueOf(((dt)localObject).o()), Integer.valueOf(((dt)localObject).p()) });
/* 127:    */       }
/* 128:142 */       vq localvq = (vq)localbcm;
/* 129:143 */       if ((k >= 0) && (k < localvq.n_())) {
/* 130:144 */         localvq.a(k, localamj);
/* 131:    */       }
/* 132:    */     }
/* 133:    */     else
/* 134:    */     {
/* 135:147 */       localObject = b(paramae, paramArrayOfString[1]);
/* 136:148 */       paramae.a(ag.d, 0);
/* 137:152 */       if ((localObject instanceof ahd)) {
/* 138:153 */         ((ahd)localObject).bh.b();
/* 139:    */       }
/* 140:156 */       if (!((wv)localObject).d(k, localamj)) {
/* 141:157 */         throw new di("commands.replaceitem.failed", new Object[] { Integer.valueOf(k), Integer.valueOf(m), localamj == null ? "Air" : localamj.C() });
/* 142:    */       }
/* 143:161 */       if ((localObject instanceof ahd)) {
/* 144:162 */         ((ahd)localObject).bh.b();
/* 145:    */       }
/* 146:    */     }
/* 147:166 */     paramae.a(ag.d, m);
/* 148:167 */     a(paramae, this, "commands.replaceitem.success", new Object[] { Integer.valueOf(k), Integer.valueOf(m), localamj == null ? "Air" : localamj.C() });
/* 149:    */   }
/* 150:    */   
/* 151:    */   private int e(String paramString)
/* 152:    */   {
/* 153:171 */     if (!a.containsKey(paramString)) {
/* 154:172 */       throw new di("commands.generic.parameter.invalid", new Object[] { paramString });
/* 155:    */     }
/* 156:174 */     return ((Integer)a.get(paramString)).intValue();
/* 157:    */   }
/* 158:    */   
/* 159:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 160:    */   {
/* 161:180 */     if (paramArrayOfString.length == 1) {
/* 162:181 */       return a(paramArrayOfString, new String[] { "entity", "block" });
/* 163:    */     }
/* 164:183 */     if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equals("entity"))) {
/* 165:184 */       return a(paramArrayOfString, d());
/* 166:    */     }
/* 167:186 */     if (((paramArrayOfString.length == 3) && (paramArrayOfString[0].equals("entity"))) || ((paramArrayOfString.length == 5) && (paramArrayOfString[0].equals("block")))) {
/* 168:187 */       return a(paramArrayOfString, a.keySet());
/* 169:    */     }
/* 170:189 */     if (((paramArrayOfString.length == 4) && (paramArrayOfString[0].equals("entity"))) || ((paramArrayOfString.length == 6) && (paramArrayOfString[0].equals("block")))) {
/* 171:190 */       return a(paramArrayOfString, alq.e.c());
/* 172:    */     }
/* 173:193 */     return null;
/* 174:    */   }
/* 175:    */   
/* 176:    */   protected String[] d()
/* 177:    */   {
/* 178:197 */     return MinecraftServer.M().I();
/* 179:    */   }
/* 180:    */   
/* 181:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 182:    */   {
/* 183:202 */     return (paramArrayOfString.length > 0) && (paramArrayOfString[0].equals("entity")) && (paramInt == 1);
/* 184:    */   }
/* 185:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cf
 * JD-Core Version:    0.7.0.1
 */