/*   1:    */ import com.google.common.collect.BiMap;
/*   2:    */ import com.google.common.collect.HashBiMap;
/*   3:    */ import com.google.common.collect.Maps;
/*   4:    */ import gnu.trove.map.TIntObjectMap;
/*   5:    */ import gnu.trove.map.hash.TIntObjectHashMap;
/*   6:    */ import java.util.Map;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public enum gy
/*  11:    */ {
/*  12:    */   private static final TIntObjectMap e;
/*  13:    */   private static final Map f;
/*  14:    */   private final int g;
/*  15:148 */   private final Map h = Maps.newEnumMap(ie.class);
/*  16:    */   
/*  17:    */   private gy(int paramInt)
/*  18:    */   {
/*  19:151 */     this.g = paramInt;
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected gy a(ie paramie, Class paramClass)
/*  23:    */   {
/*  24:155 */     Object localObject = (BiMap)this.h.get(paramie);
/*  25:157 */     if (localObject == null)
/*  26:    */     {
/*  27:158 */       localObject = HashBiMap.create();
/*  28:159 */       this.h.put(paramie, localObject);
/*  29:    */     }
/*  30:162 */     if (((BiMap)localObject).containsValue(paramClass))
/*  31:    */     {
/*  32:163 */       String str = paramie + " packet " + paramClass + " is already known to ID " + ((BiMap)localObject).inverse().get(paramClass);
/*  33:164 */       LogManager.getLogger().fatal(str);
/*  34:165 */       throw new IllegalArgumentException(str);
/*  35:    */     }
/*  36:168 */     ((BiMap)localObject).put(Integer.valueOf(((BiMap)localObject).size()), paramClass);
/*  37:169 */     return this;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public Integer a(ie paramie, id paramid)
/*  41:    */   {
/*  42:173 */     return (Integer)((BiMap)this.h.get(paramie)).inverse().get(paramid.getClass());
/*  43:    */   }
/*  44:    */   
/*  45:    */   public id a(ie paramie, int paramInt)
/*  46:    */   {
/*  47:178 */     Class localClass = (Class)((BiMap)this.h.get(paramie)).get(Integer.valueOf(paramInt));
/*  48:180 */     if (localClass == null) {
/*  49:181 */       return null;
/*  50:    */     }
/*  51:183 */     return (id)localClass.newInstance();
/*  52:    */   }
/*  53:    */   
/*  54:    */   public int a()
/*  55:    */   {
/*  56:188 */     return this.g;
/*  57:    */   }
/*  58:    */   
/*  59:    */   static
/*  60:    */   {
/*  61:145 */     e = new TIntObjectHashMap();
/*  62:146 */     f = Maps.newHashMap();
/*  63:    */     gy localgy;
/*  64:192 */     for (localgy : values())
/*  65:    */     {
/*  66:193 */       e.put(localgy.a(), localgy);
/*  67:195 */       for (ie localie : localgy.h.keySet()) {
/*  68:196 */         for (Class localClass : ((BiMap)localgy.h.get(localie)).values())
/*  69:    */         {
/*  70:197 */           if ((f.containsKey(localClass)) && (f.get(localClass) != localgy)) {
/*  71:198 */             throw new Error("Packet " + localClass + " is already assigned to protocol " + f.get(localClass) + " - can't reassign to " + localgy);
/*  72:    */           }
/*  73:    */           try
/*  74:    */           {
/*  75:202 */             localClass.newInstance();
/*  76:    */           }
/*  77:    */           catch (Throwable localThrowable)
/*  78:    */           {
/*  79:204 */             throw new Error("Packet " + localClass + " fails instantiation checks! " + localClass);
/*  80:    */           }
/*  81:207 */           f.put(localClass, localgy);
/*  82:    */         }
/*  83:    */       }
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   public static gy a(int paramInt)
/*  88:    */   {
/*  89:214 */     return (gy)e.get(paramInt);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public static gy a(id paramid)
/*  93:    */   {
/*  94:218 */     return (gy)f.get(paramid.getClass());
/*  95:    */   }
/*  96:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     gy
 * JD-Core Version:    0.7.0.1
 */